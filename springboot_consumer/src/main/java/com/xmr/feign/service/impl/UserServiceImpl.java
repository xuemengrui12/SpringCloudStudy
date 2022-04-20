package com.xmr.feign.service.impl;

import com.xmr.feign.entity.User;
import com.xmr.feign.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2020-03-20 15:51:16
 */
@Service
public class UserServiceImpl implements IUserService {

    // Spring框架对RESTful方式的http请求做了封装，来简化操作
    @Autowired
    private RestTemplate restTemplate;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public User findById(Long id){
        return restTemplate.getForObject("http://localhost:8080/user/" + id, User.class);

    }

}