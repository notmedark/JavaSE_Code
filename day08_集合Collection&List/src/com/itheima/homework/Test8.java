package com.itheima.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/*2016年里约热内卢奥运会足球比赛，共有16只球队参赛，分别是巴西、阿根廷、丹麦、德国、葡萄牙、
瑞典、斐济、洪都拉斯、墨西哥、阿尔及利亚、尼日利亚、南非、伊拉克、日本、韩国、哥伦比亚。
请使用所学集合知识，编写程序把这16支球队随机分成四组，输出结果如下：
第1组：
哥伦比亚 韩国 伊拉克 葡萄牙
第2组：
阿尔及利亚 南非 斐济 尼日利亚
第3组：
阿根廷 墨西哥 日本 洪都拉斯
第4组：
瑞典 丹麦 德国 巴西*/
public class Test8 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"巴西","阿根廷","丹麦","德国","葡萄牙","瑞典","斐济",
                                    "洪都拉斯","墨西哥","阿尔及利亚","尼日利亚","南非","伊拉克",
                                    "日本","韩国","哥伦比亚");
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            System.out.println("第"+ (i+1) +"组:");
            for (int j = 0; j < 4; j++) {
                int index = r.nextInt(list.size());
                System.out.print(list.get(index)+" ");
                list.remove(index);
            }
            System.out.println();
        }

    }
}
