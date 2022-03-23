package com.itheima.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionTest {
    public static void main(String[] args) {
        // 1. 基于接口多态创建Collection集合容器
        Collection<String> coll = new ArrayList<>();
        //2. 往集合中添加3个人名
        coll.add("龟田大郎");
        coll.add("龟田次郎");
        coll.add("龟田太郎");
        //2.1 获取一下集合的元素个数,做一个输出
        System.out.println("元素个数"+ coll.size());

        //3. 判断当前集合容器中有没有龟田大郎, 有大朗就把龟田大郎干掉
        if(coll.contains("龟田大郎")){
            coll.remove("龟田大郎");
        }

        //3.1 获取一下集合的元素个数,做一个输出
        System.out.println("元素个数"+ coll.size());

        //4. 判断当前集合是否为空并打印
        System.out.println("当前集合是否为空：" + coll.isEmpty());
        System.out.println(coll);

        //5. boolean removeIf(Object o): 根据条件删除集合中的元素
        //需求: 如果集合中的元素包含"太"字, 那就将该元素从集合中删除
        coll.removeIf(s -> s.contains("太"));
        System.out.println(coll);

        //6. 将集合清空
        coll.clear();

        //打印集合
        System.out.println(coll);
    }
}
