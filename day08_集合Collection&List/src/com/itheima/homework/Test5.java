package com.itheima.homework;

import java.util.ArrayList;

/*为方便管理，现需要将班级中学员的信息（学号、姓名、年龄）存储起来。
请使用所学集合知识将信息遍历打印。请使用foreach语句完成集合的遍历，效果如下：
姓名：吕布，学号：001，年龄：18
姓名：赵云，学号：002，年龄：19
姓名：典韦，学号：003，年龄：20
...*/
public class Test5 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("吕布","001",18));
        list.add(new Student("赵云","002",19));
        list.add(new Student("典韦","003",20));

        //1.增强for循环方式
        for(Student student : list){
            System.out.println(student);
        }

        //2.调用foreach方法，传lambda方式
        System.out.println("---------------");
        list.forEach(s -> System.out.println(s));

        //3.调用foreach方法，传方法引用
        System.out.println("---------------");
        list.forEach(System.out::println);
    }
}

class Student{
    private String name;
    private String id;
    private int age;

    public Student() {
    }

    public Student(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "姓名=" + name +
                ", 学号=" + id +
                ", 年龄=" + age ;
    }
}