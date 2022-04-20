package com.xmr.feign.service.impl;

import com.xmr.feign.entity.User;
import com.xmr.feign.service.IConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by xmr on 2020/3/22.
 */
@Service
public class ConsumerImpl implements IConsumerService {
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public User findById(Long id) {

        String url="http://eureka-provider/user/{id}";
        return restTemplate.getForObject(url, User.class,id);
    }
}
