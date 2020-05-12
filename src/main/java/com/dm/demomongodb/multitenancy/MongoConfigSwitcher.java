package com.dm.demomongodb.multitenancy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.annotation.ApplicationScope;

@Aspect
@ApplicationScope
public class MongoConfigSwitcher {
    @Autowired
    private MongoConnectionConfig defaultMongoConfig;

    @Autowired
    private MultiTenantMongoFactory multiTenantMongoFactory;

    @Around("execution(@com.example.repository.UseDefaultMongoConfig * *(..))")
    public Object useDefaultMongoConfig(ProceedingJoinPoint joinPoint) throws Throwable {
        MongoConnectionConfig mongoConfig = CurrentMongoConfigHolder.get();
        if (mongoConfig == null) {
            throw new Exception("Invalid Mongo configuration specified");
        }
        return joinPoint.proceed();
    }

    @Around("execution(* org.springframework.data.repository.Repository+.*(..))")
    public Object useCurrentMongoConfig(ProceedingJoinPoint joinPoint) throws Throwable {
        MongoConnectionConfig mongoConfig = CurrentMongoConfigHolder.get();
        if (mongoConfig == null) {
            throw new Exception("Invalid Mongo configuration specified");
        }
        return joinPoint.proceed();
    }
}
