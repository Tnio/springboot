package com.vcredit.config.dataConfig;


import com.google.common.collect.Lists;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.vcredit.config.properties.MultipleMongoProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import java.util.List;

@Slf4j
@Configuration
@Import({MongoConfig.class})
public class MultipleMongoConfig {

    @Autowired
    private MultipleMongoProperties mongoProperties;

    @Primary
    @Bean(name = MongoConfig.MONGO_TEMPLATE)
    public MongoTemplate primaryMongoTemplate() throws Exception {
        return new MongoTemplate(primaryFactory(this.mongoProperties.getPrimary()));
    }

    @Bean
    @Primary
    public MongoDbFactory primaryFactory(MongoProperties mongo) throws Exception {
        ServerAddress serverAddress = new ServerAddress(mongo.getHost(), mongo.getPort());
        List<MongoCredential> mongoCredentials = Lists.newArrayList();
        mongoCredentials.add(MongoCredential.createCredential(mongo.getUsername(), mongo.getDatabase(), mongo.getPassword()));
        log.info("=======> load ddkOnline mongo dataSource: " + mongo.getHost() + ":" + mongo.getPort() + "/" + mongo.getDatabase());
        return new SimpleMongoDbFactory(new MongoClient(serverAddress, mongoCredentials), mongo.getDatabase());
    }


//    @Bean
//    @Qualifier(SecondaryMongoConfig.MONGO_TEMPLATE)
//    public MongoTemplate secondaryMongoTemplate() throws Exception {
//        return new MongoTemplate(secondaryFactory(this.mongoProperties.getSecondary()));
//    }
//
//    @Bean
//    public MongoDbFactory secondaryFactory(MongoProperties mongo) throws Exception {
//        ServerAddress serverAddress = new ServerAddress(mongo.getHost(), mongo.getPort());
//        List<MongoCredential> mongoCredentials = Lists.newArrayList();
//        mongoCredentials.add(MongoCredential.createCredential(mongo.getUsername(), mongo.getDatabase(), mongo.getPassword()));
//        log.info("=======> load platform mongo dataSource: " + mongo.getHost() + ":" + mongo.getPort() + "/" + mongo.getDatabase());
//        return new SimpleMongoDbFactory(new MongoClient(serverAddress, mongoCredentials), mongo.getDatabase());
//    }

}