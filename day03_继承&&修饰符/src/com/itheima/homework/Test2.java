package com.itheima.homework;

public class Test2 {
    public static void main(String[] args) {
        // 创建子类对象，调用方法
        Zi z = new Zi();
        z.methodFu();
        z.methodZi();
    }
}

class Fu {
    public void methodFu(){
        System.out.println("我是父类的method方法");
    }
}

class Zi extends Fu{

    public void methodZi() {
        System.out.println("我是子类的method方法");
    }
}
