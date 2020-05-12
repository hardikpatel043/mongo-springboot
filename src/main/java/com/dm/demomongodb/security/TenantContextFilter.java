package com.dm.demomongodb.security;

import com.dm.demomongodb.multitenancy.CurrentMongoConfigHolder;
import com.dm.demomongodb.multitenancy.MongoConnectionConfig;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class TenantContextFilter extends OncePerRequestFilter {
    public static final String TENANT_HTTP_HEADER = "X-Tenant";
    public static final String DB_HTTP_HEADER = "X-db";

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String targetTenantId = request.getHeader(TENANT_HTTP_HEADER);
        String targetDb = request.getHeader(DB_HTTP_HEADER);
//        TenantConfig currentTenant = getCurrentTenant(targetTenantId);

        MongoConnectionConfig currentTenant = new MongoConnectionConfig();
        if(targetTenantId.equals("atlas")){
            currentTenant.uri="mongodb+srv://admin:Th1skn32dm36xtZM@dm-gjy0w.gcp.mongodb.net/test?retryWrites=true&w=majority";
            currentTenant.dbName=targetDb;
        }else{
            currentTenant.uri="mongodb://admin:password@35.226.110.249:27017/admin?readPreference=primary";
            currentTenant.dbName=targetDb;
        }
        CurrentMongoConfigHolder.set(currentTenant);

        filterChain.doFilter(request, response);

        CurrentMongoConfigHolder.set(null);
    }
}
