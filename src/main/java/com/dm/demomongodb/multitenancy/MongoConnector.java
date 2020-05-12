package com.dm.demomongodb.multitenancy;

import com.mongodb.client.MongoDatabase;

public interface MongoConnector {
    public MongoDatabase connect(MongoConnectionConfig connectionConfig, String dbName);
}
