package com.hjy.simple.blog.common.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义项目配置
 *
 * @author hjy
 * @date 2019/4/8
 **/
@Data
@Configuration
@ConfigurationProperties(prefix = "blog")
public class BlogProperties {
    private ShiroProperties shiro = new ShiroProperties();

}
