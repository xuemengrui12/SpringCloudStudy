package com.xmr.feign.service;

import com.xmr.feign.entity.User;

/**
 * (User)表服务接口
 *
 * @since 2020-03-20 15:51:14
 */
public interface IUserService {


    User findById(Long id);


}