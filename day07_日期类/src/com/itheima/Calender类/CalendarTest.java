package com.itheima.Calender类;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalendarTest {
    public static void main(String[] args) {
        //创建对象
        Calendar calendar = Calendar.getInstance();

        //获取calendar时间(年月日，时分秒)
        Date calendarTime = calendar.getTime();
        System.out.println(calendarTime);
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH)); //月份从0开始
        System.out.println(calendar.get(Calendar.DATE));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK)); //星期从日开始
        System.out.println(calendar.get(Calendar.HOUR));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.SECOND));

        //设置calendar时间
        calendar.set(2019,1,4);
        calendar.set(2019,1,4,10,15,34);
        System.out.println(calendar.getTime());

        //键盘录入一个年份，求这一年的2月有多少天。
        System.out.println("请输入一个年份：");
        int year = new Scanner(System.in).nextInt();

        calendar.set(year,2,1);
        calendar.add(calendar.DATE,-1);
        System.out.println(calendar.get(Calendar.DATE));
    }
}
