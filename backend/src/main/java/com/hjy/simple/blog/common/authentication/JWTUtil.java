package com.hjy.simple.blog.common.authentication;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import lombok.extern.slf4j.Slf4j;

/**
 * example
 *
 * @author hjy
 * @date 2019/4/9
 **/
@Slf4j
public class JWTUtil {

    /**
     * 校验 token 是否正确
     *
     * @param token    token
     * @param username 用户名
     * @param secret   密码
     * @return
     */
    public static boolean verify(String token, String username, String secret) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(secret);
            JWTVerifier verifier = JWT.require(algorithm)
                    .withClaim("username", username)
                    .build();
            verifier.verify(token);
            log.info("token is valid");
            return true;
        } catch (Exception e) {
            log.info("token is invalid{}", e.getMessage());
            return false;
        }
    }
}
