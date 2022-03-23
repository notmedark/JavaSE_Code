package com.itheima.homework;

import java.util.ArrayList;
import java.util.Scanner;

/*在某次比赛中，共有8位评委，采用百分制。去除一个最低分和一个最高分，
其余的平均得分即为选手的最终得分。请编写程序，使用所学集合知识，
计算选手的得分，评分分数由键盘录入。 运行效果如下：
请录入第1个评委成绩：
100
请录入第2个评委成绩：
95
请录入第3个评委成绩：
95
请录入第4个评委成绩：
90
请录入第5个评委成绩：
90
请录入第6个评委成绩：
80
请录入第7个评委成绩：
85
请录入第8个评委成绩：
90
选手最终得分为：90.83333333333333*/
public class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();

        for (int i = 0; i < 8; i++){
            System.out.println("请录入第"+ (i+1) +"个评委成绩:");
            list.add(sc.nextDouble());
        }

        double max = list.get(0);
        double min = list.get(0);
        double sum = 0;
        for (Double score : list) {
            sum += score;
            max = max > score ? max : score;
            min = min < score ? min : score;
        }
        double avg = (sum-max-min)/(list.size()-2);

        System.out.println("选手最终得分为:" + avg);
    }
}
