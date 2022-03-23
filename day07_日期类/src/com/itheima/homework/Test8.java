package com.itheima.homework;

public class Test8 {
    public static void main(String[] args) {
    /*
        -----请对异常进行处理，要求不会影响到后续代码的继续执行-----
        -----如果程序出现错误，控制台展示出现的异常名称、异常的原因、异常出现的位置-----
    */
        try {
            System.out.println(10 / 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("我是程序的后续代码");
    }


}
