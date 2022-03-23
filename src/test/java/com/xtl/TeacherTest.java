package com.xtl;

import com.xtl.entity.Teacher;
import org.junit.Test;

/**
 * @ClassName TeacherTest
 * @Description 教师测试类
 * @Author xtl
 * @Date 2022/3/21 10:50
 */
public class TeacherTest {

    @Test
    public void testTeacher() {
        Teacher teacher = Teacher.builder().id(1).name("陆林轩").password("123456").age(25).build();
        System.out.println(teacher);
        System.out.println("hello,teacher");
    }
}
