package com.itheima.homework;

import java.util.ArrayList;
import java.util.Iterator;

public class Test4 {
    public static void main(String[] args) {
        // 1. 创建集合对象
        ArrayList<String> list = new ArrayList<>();
        // 2. 添加集合元素
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        // 3. 获取迭代器
        Iterator<String> it = list.iterator();
        // 4. 循环遍历内部是否还有元素
        while(it.hasNext()){
            // 5. 取出元素
            String content = it.next();
            // 6. 判断是否是要删除的元素
            if("b".equals(content)){
                it.remove();
            }
        }
        // 7. 打印最终集合元素
        System.out.println(list);
    }
}
