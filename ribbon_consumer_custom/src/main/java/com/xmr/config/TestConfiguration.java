package com.xmr.config;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

/**
 * 使用RibbonClient，为特定name的Ribbon Client自定义配置.
 * 使用@RibbonClient的configuration属性，指定Ribbon的配置类.
 */
@Configuration
@RibbonClient(name = "ribbon-consumer-custom", configuration = RibbonConfiguration.class)
public class TestConfiguration {
}