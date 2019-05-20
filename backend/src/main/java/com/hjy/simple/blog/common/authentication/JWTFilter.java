package com.hjy.simple.blog.common.authentication;

import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.web.filter.authc.BasicHttpAuthenticationFilter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * jwt 过滤器 自定义 shiro 过滤器
 *
 * @author hjy
 * @date 2019/4/8
 **/
@Slf4j
public class JWTFilter extends BasicHttpAuthenticationFilter {
    private static final String TOKEN = "Authentication";

    @Override
    protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) {

        return super.isAccessAllowed(request, response, mappedValue);
    }

    @Override
    protected boolean isLoginAttempt(String authzHeader) {
        return super.isLoginAttempt(authzHeader);
    }

    @Override
    protected boolean executeLogin(ServletRequest request, ServletResponse response) throws Exception {
        return super.executeLogin(request, response);
    }


    @Override
    protected boolean preHandle(ServletRequest request, ServletResponse response) throws Exception {
        return super.preHandle(request, response);
    }
}
