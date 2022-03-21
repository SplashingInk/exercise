package com.xtl;

import com.xtl.myenum.SeasonEnum;
import org.junit.Test;

/**
 * @ClassName SeasonEnumTest
 * @Description 测试季节枚举
 * @Author xtl
 * @Date 2022/3/21 14:25
 */
public class SeasonEnumTest {

    @Test
    public void test() {
        System.out.println(SeasonEnum.SPRING);
        SeasonEnum summer = SeasonEnum.SUMMER;
        System.out.println(summer.getSeq());
    }
    
    @Test
    public void test2(){
        System.out.println(SeasonEnum.AUTUMN);
        System.out.println(SeasonEnum.WINTER.getSeq());
    }
}
