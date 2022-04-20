package com.xmr;

import com.xmr.ribbon.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author: Administrator
 * @Date: 2022/4/20
 * @LastEditTime: 2022/4/20 10:04
 * @LastEditors: Administrator
 * @Description:
 */
//@FeignClient的name要写成服务提供者的名称才行
@FeignClient(name = "eureka-provider")
public interface UseFeignClient {
    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id);
}
