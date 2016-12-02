package com.观察者模式.计算器;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        Subject subject = new Subject(new ArrayList<>());
        Operation operationMul = new Mul();

        subject.addOperation(new Add());
        subject.addOperation(new Div());
        subject.addOperation(operationMul);
        subject.removeOperation(operationMul);
        subject.result(1, 2);

    }
}
