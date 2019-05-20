package com.hjy.simple.blog.common.authentication;

import lombok.Data;
import org.apache.shiro.authc.AuthenticationToken;

/**
 * JSON Web Token
 * 重写 AuthenticationToken 的 getPrincipal() 和 getCredentials() 方法, 返回token
 */
@Data
public class JWTToken implements AuthenticationToken {

    private static final long serialVersionUID = 1282057025599826155L;

    private String token;

    private String exipreAt;

    public JWTToken(String token) {
        this.token = token;
    }

    public JWTToken(String token, String exipreAt) {
        this.token = token;
        this.exipreAt = exipreAt;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }

}
