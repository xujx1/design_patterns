package com.访问者模式.计算器;

/**
 * Created by xujinxin on 2016/12/2.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(new Add().accept(new Calculator(), new Parameter(1.0, 2.0)));
        System.out.println(new Sub().accept(new Calculator(), new Parameter(1.0, 2.0)));
    }
}
