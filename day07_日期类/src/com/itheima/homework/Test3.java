package com.itheima.homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*某公司想统计下员工截至到当前时间，入职公司的天数。请编写程序实现该需求，
由键盘录入员工的入职日期，格式为：xxxx年xx月xx日。将员工入职公司的天数打印到控制台。
运行结果（假设当前时间是2018年12月10日）：
请输入您入职的日期,格式为：xxxx年xx月xx日
2018年12月09日
您入职公司已经1天*/
public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您入职的日期，格式为：xxxx年xx月xx日");
        String empDate = sc.next();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date parseDate = null;
        try {
            parseDate = sdf.parse(empDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Long days = (new Date().getTime() - parseDate.getTime())/1000/60/60/24;
        System.out.println("您入职公司已经"+ days +"天");
    }

    //请使用反射技术，创建该类的对象，并为对象的属性赋值，然后反射调用显示信息的方法。
    static class Student {
        private String name;
        private int age;

        public Student() {
        }
        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }
        // 自行补充getters and setters

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        // 显示信息的方法
        public void showInfo() {
            System.out.println(name + " - " + age);
        }
    }
}
