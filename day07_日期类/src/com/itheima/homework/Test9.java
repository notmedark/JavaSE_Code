package com.itheima.homework;

import java.util.Scanner;

/*某程序员从控制台采集用户数据封装成Person对象，采集到的数据都是字符串，
所以对于特殊的，数值数据需要特殊处理，例如年龄就是int类型的，但用户输入的时候可能会出现失误，
请结合所学知识，避免这种用户失误而导致后续代码不能执行。（从前台采集数据用Scanner模拟）
运行结果：
请输入姓名：
张三
请输入年龄：
23a
您输入的年龄格式有误，请重新输入！
请输入年龄：
...
您输入的年龄格式有误，请重新输入！
请输入年龄：
23
输入完毕，信息为：
Person{name=}*/
public class Test9 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("请输入姓名：");
        String name = sc.next();
        person.setName(name);
        while(true){
            System.out.println("请输入年龄：");
            try {
                person.setAge(Integer.parseInt(sc.next()));
                break;
            } catch (NumberFormatException e) {
                System.out.println("您输入的年龄格式有误，请重新输入！");
            }
        }
        System.out.println("输入完毕，信息为：");
        System.out.println(person);
    }
}

class Person{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}