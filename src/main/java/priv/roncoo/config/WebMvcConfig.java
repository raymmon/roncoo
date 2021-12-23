package priv.roncoo.config;

import com.google.common.base.Predicates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import priv.roncoo.config.properties.Swagger3Properties;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Spring MVC 配置
 *
 * @author lei.xu
 * 2021/12/23 2:00 下午
 */
@EnableSwagger2
@Configuration
@EnableConfigurationProperties({Swagger3Properties.class})
public class WebMvcConfig {

    @Autowired
    private Swagger3Properties swagger3Properties;

    @Value("${server.servlet.context-path:/}")
    private String pathMapping;

    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.OAS_30)
                .enable(this.swagger3Properties.isEnabled())
                .pathMapping(this.pathMapping)
                .apiInfo(
                        new ApiInfoBuilder()
                                .title(this.swagger3Properties.getTitle())
                                .description(this.swagger3Properties.getDescription())
                                .version(this.swagger3Properties.getVersion())
                                .contact(new Contact(this.swagger3Properties.getAuthor(), null, null))
                                .build()
                ).select()
                // 对所有api进行监控
                .apis(RequestHandlerSelectors.any())
                // 对跟路径下所有类进行监控
                .paths(PathSelectors.regex("/*"))
                .build();
    }

}
