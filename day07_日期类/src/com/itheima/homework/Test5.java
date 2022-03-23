package com.itheima.homework;

import java.util.Calendar;

public class Test5 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2018,11,10);
        // 获取年份
        int year = c.get(Calendar.YEAR);
    /*
        -----获取月日并输出-----
    */
        int month = c.get(Calendar.MONTH) + 1;
        int date = c.get(Calendar.DATE);

        System.out.println("获取到的年份为：" + year);
        System.out.println("获取到的月份为：" + month);
        System.out.println("获取到的日为：" + date);
    }

}
