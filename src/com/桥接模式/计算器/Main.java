package com.桥接模式.计算器;


public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Calculator(new Add()).result(1.0, 2.0));
        System.out.println(new Calculator(new Mul()).result(1.0, 2.0));
        System.out.println(new Calculator(new Div()).result(1.0, 2.0));
        System.out.println(new Calculator(new Sub()).result(1.0, 2.0));

    }
}
