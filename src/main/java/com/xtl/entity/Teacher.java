package com.xtl.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Teacher
 * @Description 教师实体类
 * @Author xtl
 * @Date 2022/3/21 10:49
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {
    private Integer id;
    private String name;
    private String password;
    private Integer age;
}
