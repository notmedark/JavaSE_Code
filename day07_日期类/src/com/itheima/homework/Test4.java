package com.itheima.homework;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*某共公司产品经理要求App需要有3款主题样式，用户选择不同的主题，展示时间的格式也要有不同的风格，
请编写代码实现该功能。
运行结果：
请选择主题：1.xxxx年xx月xx日，2.xxxx-xx-xx，3.xxxx/xx/xx
1
主题切换成功,当前时间为：2018年12月10日

请选择主题：1.xxxx年xx月xx日，2.xxxx-xx-xx，3.xxxx/xx/xx
4
很抱歉，操作有误，已为您切换默认主题
主题切换成功,当前时间为：2018年12月10日*/
public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请选择主题：1.xxxx年xx月xx日，2.xxxx-xx-xx，3.xxxx/xx/xx");
            String choice = sc.next();

            switch (choice){
                default:
                    System.out.println("很抱歉，操作有误，已为您切换默认主题");
                case "1":
                    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日");
                    System.out.println("主题切换成功,当前时间为：" + sdf1.format(new Date()));
                    break;
                case "2":
                    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
                    System.out.println("主题切换成功,当前时间为：" + sdf2.format(new Date()));
                    break;
                case "3":
                    SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy/MM/dd");
                    System.out.println("主题切换成功,当前时间为：" + sdf3.format(new Date()));
                    break;

            }
        }
    }
}
