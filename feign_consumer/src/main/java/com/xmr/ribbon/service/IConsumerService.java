package com.xmr.ribbon.service;

import com.xmr.ribbon.entity.User;

/**
 * Created by xmr on 2020/3/22.
 */
public interface IConsumerService {
    User findById(Long id);
}
