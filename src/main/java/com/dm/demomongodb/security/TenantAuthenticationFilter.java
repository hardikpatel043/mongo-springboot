package com.dm.demomongodb.security;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

public class TenantAuthenticationFilter extends BasicAuthenticationFilter {
    public static final String TENANT_HTTP_HEADER = "X-Tenant";

    public TenantAuthenticationFilter(AuthenticationManager authenticationManager, AuthenticationEntryPoint authenticationEntryPoint) {
        super(authenticationManager, authenticationEntryPoint);
    }

    @Override
    protected boolean shouldNotFilter(HttpServletRequest request) throws ServletException {
        String tenantId = request.getHeader(TENANT_HTTP_HEADER);
        // Authenticate user only if:
        //   1) Tenant identifier is passed via "X-Tenant" HTTP header
        //   2) There is no authenticated user in the security context
        return tenantId == null;
    }
}
