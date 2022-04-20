package com.xmr.feign.controller;

import com.xmr.feign.UseFeignClient;
import com.xmr.feign.entity.User;
import com.xmr.feign.service.IConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xmr on 2020/3/20.
 */
@RestController
public class ConsumerController {
    @Autowired
    private IConsumerService consumerService;
//    @Autowired
//    private DiscoveryClient discoveryClient;

    @Autowired
    private UseFeignClient useFeignClient;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) {

        return consumerService.findById(id);
    }
    @GetMapping("/feign/{id}")
    public User findUser(@PathVariable Long id) {

        return useFeignClient.findById(id);
    }
//    @GetMapping("/user-instance")
//    public List<ServiceInstance> getServiceInstances(@PathVariable String applicationName){
//        return this.discoveryClient.geti();
//    }
}
