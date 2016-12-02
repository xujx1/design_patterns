package com.组合模式.计算器;

/**
 * Created by xujinxin on 2016/11/22.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Add().result(1, 2));
        System.out.println(new Div().result(1, 2));
        System.out.println(new Mul().result(1, 2));
        System.out.println(new Sub().result(1, 2));
    }
}
