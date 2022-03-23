package com.itheima.homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test2 {
    public static void main(String[] args) {
        String s = "2008-08-08";

        /*
           ----- 将字符串s转换为日期对象，并得到毫秒值.-----
         */

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date parseDate = null;
        try {
            parseDate = sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println(parseDate);
        System.out.println(parseDate.getTime());

    }
}
