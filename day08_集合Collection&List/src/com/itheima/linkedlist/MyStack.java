package com.itheima.linkedlist;

import java.util.LinkedList;

public class MyStack {
    private LinkedList<String> linkedListStack = new LinkedList<>();

    public void push(String str){
        linkedListStack.addLast(str);
    }

    public void pop(){
        if(!isEmpty()){
            String last = linkedListStack.getLast();
            linkedListStack.removeLast();
        }else{
            System.out.println("栈为空，无法弹出数据");
        }
    }

    public String peek(){
        if(isEmpty()){
            System.out.println("栈为空，无数据");
        }else{
            return linkedListStack.getLast();
        }
        return null;
    }

    public boolean isEmpty(){
        return linkedListStack.isEmpty();
    }

    @Override
    public String toString() {
        return "MyStack{" +
                linkedListStack +
                '}';
    }
}
