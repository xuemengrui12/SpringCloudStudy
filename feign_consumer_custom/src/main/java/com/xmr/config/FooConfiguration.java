package com.xmr.config;

import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Administrator
 * @Date: 2022/4/20
 * @LastEditTime: 2022/4/20 13:36
 * @LastEditors: Administrator
 * @Description:
 */
@Configuration
public class FooConfiguration {
    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor(){
        return new BasicAuthRequestInterceptor("user","password");
    }
}
