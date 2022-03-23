package com.itheima.homework;

public class Test7 {
    /*
       -----请编写代码，将可能会出现的异常全部进行捕获-----
    */
    public static void main(String[] args) {
        try{
            String[] arr = {"abc","bbc","ccc"};
            System.out.println(arr[10]);
            arr = null;
            System.out.println(arr[0]);
        }catch (NullPointerException e){
            System.out.println("捕获数组空指针异常");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("捕获数组索引越界异常");
        }
    }

}
