package com.命令模式.计算器;


public class Main {
    public static void main(String[] args) throws Exception {
        ICalculator calculator = new Calculator();
        IOperation operation = new Sub();
        calculator.add(operation);
        calculator.add(new Add());
        calculator.add(new Div());
        calculator.add(new Mul());
        calculator.remove(operation);
        new Person(calculator, new Parameter(1.0, 2.0)).result();
    }
}
