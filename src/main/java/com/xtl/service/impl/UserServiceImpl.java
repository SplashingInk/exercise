package com.xtl.service.impl;

import com.xtl.service.UserService;

/**
 * @ClassName UserServiceImpl
 * @Description UserService接口实现类
 * @Author xtl
 * @Date 2022/3/18 14:43
 */
public class UserServiceImpl implements UserService {
    @Override
    public void getUser() {
        System.out.println("这是boy分支实现的UserService接口方法");
    }
}
