package com.xmr.feign.service;

import com.xmr.feign.entity.User;

/**
 * Created by xmr on 2020/3/22.
 */
public interface IConsumerService {
    User findById(Long id);
}
