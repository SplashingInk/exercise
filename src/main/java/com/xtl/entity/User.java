package com.xtl.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName User
 * @Description TODO
 * @Author xtl
 * @Date 2022/3/18 11:42
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer id;
    private String  username;
    private Integer age;
    private Character sex;
    
    public void hello(){
        System.out.println("hello");
	int i=10;
	for(int j=0;j<i;j++){
		System.out.println(j)		  
	}
    }
}
