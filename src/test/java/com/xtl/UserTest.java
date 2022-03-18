package com.xtl;

import com.xtl.entity.User;
import org.junit.Test;

/**
 * @ClassName UserTest
 * @Description TODO
 * @Author xtl
 * @Date 2022/3/18 11:45
 */
public class UserTest {

    @Test
    public void testUser(){
        User user=new User(1,"李星云",25,'男');
        System.out.println(user);
    }
}
