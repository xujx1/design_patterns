package com.中介者模式.计算器;


public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Calculator(new Add(), new Div()).result(1.0, 2.0));
    }
}
