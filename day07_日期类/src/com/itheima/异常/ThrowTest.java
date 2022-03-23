package com.itheima.异常;

public class ThrowTest {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
        int[] arr = null;

        printArr(arr);
    }

    private static void printArr(int[] arr) {
        if(arr == null){
            throw new RuntimeException("数组为空，空指针异常");
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr);
        }
    }
}
