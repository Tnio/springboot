package com.vcredit.config.dataConfiguration;


import com.vcredit.config.dataConfig.MultipleMongoConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(MultipleMongoConfig.class)
public class MongoConfiguration {

}
