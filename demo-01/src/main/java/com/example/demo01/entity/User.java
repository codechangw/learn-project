package com.example.demo01.entity;

import lombok.Data;

/**
 * @Classname User
 * @Description TODO
 * @Date 2023/10/11 12:34
 * @Author ChangWang
 */
@Data
public class User {
    private long id;
    private String username;
    private String password;
    private String realName;
}
