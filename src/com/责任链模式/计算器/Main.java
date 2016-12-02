package com.责任链模式.计算器;

public class Main {
    public static void main(String[] args) throws Exception {
        Operation add = new Add();
        Operation mul = new Mul();
        Operation sub = new Sub();
        Operation div = new Div();
        System.out.println(add.result(new Parameter(1.0, 2.0)));
        System.out.println(add.next(mul, new Parameter(1.0, 2.0)));
        System.out.println(mul.next(sub, new Parameter(1.0, 2.0)));
        System.out.println(sub.next(div, new Parameter(1.0, 2.0)));
    }
}
