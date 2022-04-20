package com.xmr.feign;

import com.xmr.config.FeignConfiguration;
import com.xmr.feign.entity.User;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author: Administrator
 * @Date: 2022/4/20
 * @LastEditTime: 2022/4/20 10:04
 * @LastEditors: Administrator
 * @Description:使用@FeignClient的configuration属性指定配置类
 */
//@FeignClient的name要写成服务提供者的名称才行
@FeignClient(name = "eureka-provider", configuration = FeignConfiguration.class)
public interface UseFeignClient {

    @RequestLine("GET /user/{id}")
    public User findById(@Param("id") Long id);
}
