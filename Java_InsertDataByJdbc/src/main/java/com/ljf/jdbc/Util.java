package com.ljf.jdbc;

import java.util.Random;

/**
 * @Author: ljf
 * @Create: 2021/12/18 22:31
 * @Description:
 **/
public class Util {


    public static String getPhone(){
        StringBuilder stringBuilder = new StringBuilder();
        Random rand = new Random();
        int a = rand.nextInt(10);
        int b = rand.nextInt(10);
        int c = rand.nextInt(10);
        int d = rand.nextInt(10);
        return stringBuilder.append("188").append(a).append(b).append(c).append(d).append(a).append(b).append(c).append(d).toString();
    }

    public static Integer getIntegral(){
        Random rand = new Random();
        int a = rand.nextInt(10);
        int b = rand.nextInt(10);
        int c = rand.nextInt(10);
        int d = rand.nextInt(10);
        return a*b*c*d;
    }

    public static String getStr(){
        String[] str = new String[]{
                "荷塘的四面，远远近近，高高低低都是树，而杨柳最多,",
                "树缝里也漏着一两点路灯光，没精打采的，是渴睡,",
                "忽然想起采莲的事情来了。采莲是江南的旧俗，似乎很早就有,",
                "采莲南塘秋，莲花过人头；低头弄莲子，莲子清如水。",
                "今晚若有采莲人，这儿的莲花也算得“过人头”了；",
                "忽然想起采莲的事情来了。采莲是江南的旧俗，似乎很早就有，而六朝时为盛；",
                "月光如流水一般，静静地泻在这一片叶子和花上。薄薄的青雾浮起在荷塘里",
                "像今晚上，一个人在这苍茫的月下，什么都可以想，什么都可以不想，便觉是个自由的人。",
                "这时候叶子与花也有一丝的颤动，像闪电般，霎时传过荷塘的那边去了。",
                "今晚在院子里坐着乘凉，忽然想起日日走过的荷塘，在这满月的光里，总该另有一番样子吧。"};
        StringBuilder stringBuilder = new StringBuilder();
        Random rand = new Random();
        int a = rand.nextInt(10);
        int b = rand.nextInt(10);
        int c = rand.nextInt(10);
        return stringBuilder.append(a).append(str[a]).append(str[b]).append(str[c]).toString();
    }


    public static String getStr2(){
        String[] str = new String[]{
                "浦东新区",
                "徐汇区",
                "闵行区",
                "临港",
                "普陀区",
                "桂林路",
                "集发大楼",
                "上南路",
                "金谊广场",
                "我是来梦游的"};
        StringBuilder stringBuilder = new StringBuilder();
        Random rand = new Random();
        int a = rand.nextInt(10);
        int b = rand.nextInt(10);
        int c = rand.nextInt(10);
        return stringBuilder.append("上海市").append(str[a]).append(str[b]).append(str[c]).toString();
    }


    public static String getStrName(){
        String[] str = new String[]{
                "赵",
                "钱",
                "孙",
                "李",
                "周",
                "吴",
                "郑",
                "王",
                "南宫",
                "欧阳",};
        StringBuilder stringBuilder = new StringBuilder();
        Random rand = new Random();
        int a = rand.nextInt(10);
        int b = rand.nextInt(10);
        int c = rand.nextInt(10);
        return stringBuilder.append(str[a]).append(a).append(b).append(c).toString();
    }


    public static String getLabel(){
        String[] str = new String[]{
                "开朗",
                "痛苦",
                "内向",
                "卑鄙",
                "年轻",
                "秃头",
                "绝望",
                "漂浪",
                "帅气",
                "无敌",};
        StringBuilder stringBuilder = new StringBuilder();
        Random rand = new Random();
        int a = rand.nextInt(10);
        int b = rand.nextInt(10);
        int c = rand.nextInt(10);
        return stringBuilder.append(str[a]).append(str[b]).append(str[c]).toString();
    }


}
