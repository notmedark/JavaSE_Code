package com.itheima.homework;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        /*
        	... 需要补充的代码，定义集合，并存储元素
        */
        ArrayList<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("aaa");
        list.add("aaa");
        list.add("ccc");
        list.add("bbb");
        // 直接打印对象，由于重写了toString()，显示集合中的元素
        System.out.println(list);
    }
}
