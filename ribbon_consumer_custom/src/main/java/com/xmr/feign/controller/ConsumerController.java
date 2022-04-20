package com.xmr.feign.controller;

import com.xmr.feign.entity.User;
import com.xmr.feign.service.IConsumerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xmr on 2020/3/20.
 */
@RestController
public class ConsumerController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ConsumerController.class);

    @Autowired
    private IConsumerService consumerService;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) {

        return consumerService.findById(id);
    }
}
