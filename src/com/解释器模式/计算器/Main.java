package com.解释器模式.计算器;


public class Main {
    public static void main(String[] args) throws Exception {
        Parameter parameter = new Parameter(1.0, 2.0);
        System.out.println(new Calculator(new Add()).result(parameter));
        System.out.println(new Calculator(new Div()).result(parameter));
        System.out.println(new Calculator(new Mul()).result(parameter));
        System.out.println(new Calculator(new Sub()).result(parameter));
    }
}
