package com.xmr.config;

import feign.Contract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Administrator
 * @Date: 2022/4/20
 * @LastEditTime: 2022/4/20 11:53
 * @LastEditors: Administrator
 * @Description:
 * 该类为Feign的配置类
 * 注意: 该不应该在主应用程序上下文的@ComponentScan中。
 */
@Configuration
public class FeignConfiguration {
    /**
     * 将契约改为feign原生的默认契约。 这样就可以使用 feign自带的注解了 。
     * @return 默认的feign契约
     */
    @Bean
    public Contract feignContract(){
        return new Contract.Default();
    }
}
