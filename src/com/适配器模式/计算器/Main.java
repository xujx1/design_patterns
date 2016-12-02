package com.适配器模式.计算器;

/**
 * 测试类
 */
public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println( new Add().result(1.0, 2.0));
        System.out.println( new Add().result(2.0));
        System.out.println( new Mul().result(1.0, 2.0));
        System.out.println( new Mul().result(2.0));
        System.out.println( new Div().result(1.0, 2.0));
        System.out.println( new Div().result(2.0));
        System.out.println( new Sub().result(1.0, 2.0));
        System.out.println( new Sub().result(2.0));
    }
}
