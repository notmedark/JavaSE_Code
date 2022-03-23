package com.itheima.homework;

public class Test4 {
    public static void main(String[] args) {
        //有参构造初始化
        Student1 s = new Student1("张三",23);

        System.out.println(s.getName() + "..." + s.getAge());
    }
}
class Person1{
    private String name;
    private int age;

    public Person1() {
    }

    public Person1(String name, int age) {
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
}

class Student1 extends Person1 {
    public Student1(){
    }

    public Student1(String name,int age){
        super(name,age);
    }

}
