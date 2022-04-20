package com.xmr.feign.service.impl;

import com.xmr.feign.entity.User;
import com.xmr.feign.service.IConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by xmr on 2020/3/22.
 */
@Service
public class ConsumerImpl implements IConsumerService {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Override
    public User findById(Long id) {
        String serviceId = "eureka-provider";
        ServiceInstance serviceInstance=loadBalancerClient.choose(serviceId);
        System.out.println(serviceInstance.getHost()+"  "+serviceInstance.getPort());

        String url="http://eureka-provider/user/{id}";
        return restTemplate.getForObject(url, User.class,id);
    }
}
