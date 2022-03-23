package com.xtl;

import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Optional;
import java.util.Random;
import java.util.logging.Logger;

/**
 * @ClassName OtherTest
 * @Description TODO
 * @Author xtl
 * @Date 2022/3/22 8:13
 */
public class OtherTest {

    @Test
    public void test() {
        BigDecimal x = new BigDecimal("1.0");
        BigDecimal y = new BigDecimal("0.9");
        BigDecimal z = new BigDecimal("0.8");
        BigDecimal a = x.subtract(y);
        BigDecimal b = y.subtract(z);
        if (a.equals(b)) {
            System.out.println(a);
            System.out.println(b);
            System.out.println("true");
        }
    }

    @Test
    public void testOptional() {
        Optional<Integer> optional1 = Optional.empty();
        Optional<Integer> optional2 = Optional.empty();
        System.out.println(optional1 == optional2);// true
        System.out.println(optional1 == Optional.<Integer>empty());// true

        Object o1 = Optional.<Integer>empty();
        Object o2 = Optional.<String>empty();
        System.out.println(o1 == o2);// true

    }

    @Test
    public void testString() {
        String str = "a,b,c,,";
        String[] ary = str.split(",");
        System.out.println(ary.length);//结果是3
    }

    @Test
    public void testTime() {
        int i = LocalDate.now().lengthOfYear();
        System.out.println("当前所在年份一共有 " + i + " 天");
        System.out.println(LocalDate.of(2020, 2, 5).lengthOfYear());
    }


    @Test
    public void testRandom() {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            System.out.println(random.nextInt(20));
        }
        Logger logger = Logger.getLogger("OtherTest");
        logger.info("hello");
    }


}
