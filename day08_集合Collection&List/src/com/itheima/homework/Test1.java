package com.itheima.homework;

import java.util.ArrayList;
import java.util.Collection;

public class Test1 {
    public static void main(String[] args) {
        // 1. 创建集合对象
        Collection<String> c = new ArrayList<>();
        // 2. 添加元素到集合中
        c.add("ArrayList");
        c.add("LinkedList");
        c.add("HashSet");
        c.add("TreeSet");
        c.add("HashMap");
        c.add("TreeMap");
        // 3. 打印并显示集合元素
        System.out.println(c);
    }

}
