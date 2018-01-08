package com.vcredit;

import com.vcredit.config.dataConfig.MultipleMongoConfig;
import com.vcredit.config.dataConfiguration.DbConfiguration;
import com.vcredit.config.dataConfiguration.MongoConfiguration;
import com.vcredit.config.properties.MultipleMongoProperties;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@MapperScan({"com.vcredit.mapper"})
@Import({DbConfiguration.class, MongoConfiguration.class, MultipleMongoConfig.class, MultipleMongoProperties.class})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
