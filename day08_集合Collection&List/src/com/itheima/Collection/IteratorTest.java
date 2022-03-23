package com.itheima.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        ArrayList<String> coll = new ArrayList<>();
        coll.add("aa");
        coll.add("bb");
        coll.add("cc");
        coll.add("dd");

        //1.游标方式遍历
        Iterator<String> iterator = coll.iterator();
        String num = "-1";

        while (iterator.hasNext()){  //hasNext()方法先判断cursor!=size才会往下执行

            num = iterator.next();   //先判断expectedModCount == modCount才会往下执行，否则抛异常
            if(num.equals("cc")){
                coll.remove("cc");
                continue;
            }
            System.out.println(num);

        }
        System.out.println("-----------");
        //2.foreach()方法遍历
        //2.1：lambda表达式
        coll.forEach(num1 -> System.out.println(num1));
        System.out.println("-----------");
        //2.2：方法引用
        coll.forEach(System.out::println);
        System.out.println("-----------");

        //3.增强for循环遍历
        for (String integer : coll) {
            System.out.println(integer);
        }
    }
}
