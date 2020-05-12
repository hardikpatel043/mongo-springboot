package com.dm.demomongodb.multitenancy;

public class MongoConnectionConfig {
    public String uri;
    public String dbName;
    public String getDbName() {
        return dbName;
    }
    public String getUri() {
        return uri;
    }
}
