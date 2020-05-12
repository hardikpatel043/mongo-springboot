package com.dm.demomongodb;

import com.dm.demomongodb.multitenancy.CachedMongoConnector;
import com.dm.demomongodb.multitenancy.MongoConnectionConfig;
import com.dm.demomongodb.multitenancy.MongoConnector;
import com.dm.demomongodb.multitenancy.MultiTenantMongoFactory;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import java.net.UnknownHostException;

@SpringBootApplication(exclude = {
		MongoAutoConfiguration.class,
		MongoDataAutoConfiguration.class
})
public class DemomongodbApplication {

	public @Bean
	MongoDbFactory getMongoDbFactory() throws UnknownHostException {
		return new MultiTenantMongoFactory(new CachedMongoConnector());
	}
	public @Bean(name = "mongoTemplate")
	MongoTemplate getMongoTemplate() throws UnknownHostException {
		MongoTemplate mongoTemplate = new MongoTemplate(getMongoDbFactory());
		return mongoTemplate;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemomongodbApplication.class, args);
	}

}
