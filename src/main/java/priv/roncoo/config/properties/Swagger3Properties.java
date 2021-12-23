package priv.roncoo.config.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Spring fox in swagger 3. 配置信息
 *
 * @author lei.xu
 * 2021/12/23 2:01 下午
 */
@Getter
@Setter
@ConfigurationProperties(prefix = "roncoo.swagger")
public class Swagger3Properties {

    @Value("${roncoo.swagger:false}")
    private boolean enabled;

    private String basePackage;

    private String title;

    private String description;

    private String version;

    private String author;

}
