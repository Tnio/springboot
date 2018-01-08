package com.vcredit.config.dataConfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.vcredit.data.repository",mongoTemplateRef = MongoConfig.MONGO_TEMPLATE)
public class MongoConfig {

    public static final String MONGO_TEMPLATE = "MongoTemplate";
}