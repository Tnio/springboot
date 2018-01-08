package com.vcredit.config;

import com.google.common.base.Predicate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static com.google.common.base.Predicates.or;
import static springfox.documentation.builders.PathSelectors.regex;

/**
 * Created by yanhao on 2017/10/10.
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {

    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .paths(paths())
                .build()
                .apiInfo(apiInfo());
    }

    private Predicate<String> paths() {
        return or(
                regex("/user.*"));
    }

    private ApiInfo apiInfo() {
        String title = "Springboot-learning";
        String description = "";
        String version = "1.0.0-snapshot";
        Contact contact = new Contact("o2o", "", "-platform.com");
        ApiInfo apiInfo = new ApiInfo(title, description, version,
                "terms of service", contact, "", "");
        return apiInfo;
    }
}
