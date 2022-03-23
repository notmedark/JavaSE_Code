package com.itheima.linkedlist;

import org.junit.Test;

import java.util.*;

public class LinkedListTest {
    @Test
    public void test1(){
        LinkedList<String> list = new LinkedList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        System.out.println("-----------------");
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println("-----------------");
        list.addFirst("111");
        list.addLast("222");
        System.out.println(list);
        System.out.println("-----------------");
        list.removeFirst();
        list.removeLast();
        System.out.println(list);


    }

    @Test
    public void test2(){
        MyStack myStack = new MyStack();
        myStack.peek();
        myStack.pop();

        for (int i = 0; i < 10; i++) {
            myStack.push(i+"");
        }
        myStack.pop();
        myStack.pop();
        myStack.pop();

        System.out.println(myStack.peek());
        System.out.println(myStack);
    }

}
