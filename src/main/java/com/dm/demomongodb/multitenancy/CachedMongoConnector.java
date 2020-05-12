package com.dm.demomongodb.multitenancy;

import com.mongodb.*;
import com.mongodb.client.MongoDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

import java.util.Collections;

@Component
@ApplicationScope
public class CachedMongoConnector implements MongoConnector {

    @Autowired
    public CachedMongoConnector() {
    }

    @Override
    public MongoDatabase connect(MongoConnectionConfig connectionConfig, String dbName) {
        String configDbName = connectionConfig.getDbName();
        //MongoClient mongoConnection = cache.get(connectionConfig, config -> initMongoConnection(config));
        MongoClient mongoConnection =initMongoConnection(connectionConfig);
        return mongoConnection.getDatabase(configDbName);
    }

    private MongoClient initMongoConnection(MongoConnectionConfig config) {
        return initAuthenticatedMongoConnection(config);
    }

    private MongoClient initAuthenticatedMongoConnection(MongoConnectionConfig config) {
//        MongoCredential credential = MongoCredential.createCredential(
//                "admin",
//                "admin",
//                "password".toCharArray()
//        );
//        ServerAddress serverAddress = new ServerAddress("35.224.193.56", 27017);
//        return new MongoClient(serverAddress, Collections.singletonList(credential));

        MongoClientURI uri = new MongoClientURI(config.getUri());
        return new MongoClient(uri);
    }
}
