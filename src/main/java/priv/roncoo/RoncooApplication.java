package priv.roncoo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan({"priv.roncoo.dao"})
@SpringBootApplication
public class RoncooApplication {

    public static void main(String[] args) {
        SpringApplication.run(RoncooApplication.class, args);
    }

}
