package com.xtl;

import com.xtl.entity.User;
import org.junit.Test;

/**
 * @ClassName UserTest
 * @Description 用户测试类
 * @Author xtl
 * @Date 2022/3/18 11:45
 */
public class UserTest {

    @Test
    public void testUser(){
        User user = new User(1, "李星云", 25, '男');
        System.out.println(user);
        user.hello();
        User user1 = User.builder().id(2).username("姬如雪").age(22).sex('女').build();
        System.out.println(user1);
    }
}
