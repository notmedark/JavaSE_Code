package com.itheima.homework;

public class Test6 {
    public static void main(String[] args) {
        BaseTeacher baseTeacher = new BaseTeacher("张三",23);
        WorkTeacher workTeacher = new WorkTeacher("李四",24);

        System.out.println(baseTeacher.getName() + "..." + baseTeacher.getAge());
        baseTeacher.teach();
        System.out.println(workTeacher.getName() + "..." + workTeacher.getAge());
        workTeacher.teach();
    }



}

class BaseTeacher extends Teacher{
    public BaseTeacher() {
    }

    public BaseTeacher(String name, int age) {
        super(name, age);
    }
    @Override
    public void teach(){
        System.out.println("基础班老师讲JavaSE");
    }
}

class WorkTeacher extends Teacher{
    public WorkTeacher() {
    }

    public WorkTeacher(String name, int age) {
        super(name, age);
    }
    @Override
    public void teach(){
        System.out.println("就业班老师讲JavaEE");
    }
}

abstract class Teacher{
    private String name;
    private int age;

    public Teacher() {
    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void teach();

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