package com.itheima.homework;

public class Test1 {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("张三");
        stu.setAge(25);
        stu.setBirthday("1996-5-7");
        stu.setSchool("黑马");
        System.out.println(stu.getInfo());
    }
}

class Person {
    private String name; // 姓名
    private int age; // 年龄
    private String birthday; // 生日

    // 获取信息的方法
    public String getInfo() {
        return "Person[name=" + name + ", age=" + age + ", birthday=" + birthday + "]";
    }


    /*
    getters and setters请自行生成
    */

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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}

class Student extends Person{
    private String school; // 所在学校

    // 获取信息的方法
    public String getInfo() {
        return "Student[name=" + getName() + ", age=" + getAge() + ", birthday=" + getBirthday() + ", school=" + school + "]";
    }

    /*
    getters and setters请自行生成
    */

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}