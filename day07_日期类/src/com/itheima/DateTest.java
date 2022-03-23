package com.itheima;

import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        //创建对象：
            // 不带参：当前时间
            // 带参：时间原点过了参数毫秒值的时间
        Date date = new Date(1000L*60);
        System.out.println(date);
    }
}
