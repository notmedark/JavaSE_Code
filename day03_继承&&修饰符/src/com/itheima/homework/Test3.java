package com.itheima.homework;

public class Test3 {
    public static void main(String[] args) {
        Zi1 z = new Zi1();
        z.method();
    }
}
class Fu1 {
    int num = 10;
}

class Zi1 extends Fu1{
    int num = 20;
    public void method(){
        int num = 30;
        // 这里要求输出30
        System.out.println(num);
        // 这里要求输出20
        System.out.println(this.num);
        // 这里要求输出10
        System.out.println(super.num);
    }
}
