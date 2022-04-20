package com.xmr.ribbon.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Created by xmr on 2020/3/20.
 */
@Data
public class User {

    private Long id;
    private String username;
    private String name;
    private Integer age;
    private BigDecimal balance;

}
