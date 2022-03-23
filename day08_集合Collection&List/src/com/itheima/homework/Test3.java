package com.itheima.homework;

import java.util.ArrayList;
import java.util.Iterator;

/*顺序列表ArrayList中存储了如下字符串["hehe", "haha", "heihei","gege", "gaga"]，
请使用迭代器遍历集合，按顺序输出元素。*/
public class Test3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hehe");
        list.add("haha");
        list.add("heihei");
        list.add("gege");
        list.add("gaga");

        //1.迭代器方式遍历输出
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //2.增强for循环方式输出
        System.out.println("---------------");
        for (String s : list) {
            System.out.println(s);
        }

        //3.调用foreach方法，传lambda方式
        System.out.println("---------------");
        list.forEach(s -> System.out.println(s));

        //4.调用foreach方法，传方法引用
        System.out.println("---------------");
        list.forEach(System.out::println);
    }
}
