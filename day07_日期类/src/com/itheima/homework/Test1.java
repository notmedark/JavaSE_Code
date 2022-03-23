package com.itheima.homework;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
    public static void main(String[] args) {
        Date currentDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        String formatDate = sdf.format(currentDate);
        System.out.println(formatDate);
    }
}
