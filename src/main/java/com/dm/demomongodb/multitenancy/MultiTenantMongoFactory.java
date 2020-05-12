package com.dm.demomongodb.multitenancy;

import com.mongodb.ClientSessionOptions;
import com.mongodb.DB;
import com.mongodb.client.ClientSession;
import com.mongodb.client.MongoDatabase;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.support.PersistenceExceptionTranslator;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoExceptionTranslator;
import org.springframework.web.context.annotation.ApplicationScope;

@ApplicationScope
public class MultiTenantMongoFactory implements MongoDbFactory {

    private final MongoConnector mongoConnector;
    private final MongoExceptionTranslator exceptionTranslator;

    public MultiTenantMongoFactory(MongoConnector mongoConnector) {
        this.mongoConnector = mongoConnector;
        this.exceptionTranslator = new MongoExceptionTranslator();
    }

    @Override
    public MongoDatabase getDb() throws DataAccessException {
        MongoConnectionConfig currentConfig = CurrentMongoConfigHolder.get();
        return getDb(currentConfig, currentConfig.getDbName());
    }

    @Override
    public MongoDatabase getDb(String dbName) throws DataAccessException {
        return getDb(CurrentMongoConfigHolder.get(), dbName);
    }

    private MongoDatabase getDb(MongoConnectionConfig config, String dbName) {
        return mongoConnector.connect(config, dbName);
    }

    @Override
    public PersistenceExceptionTranslator getExceptionTranslator() {
        return exceptionTranslator;
    }

    @Override
    public DB getLegacyDb() {
        return null;
    }

    @Override
    public ClientSession getSession(ClientSessionOptions options) {
        return null;
    }

    @Override
    public MongoDbFactory withSession(ClientSession session) {
        return null;
    }
}
