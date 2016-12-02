package com.命令模式.计算器;

class Person {
    private ICalculator calculator;
    private Parameter parameter;

    Person(ICalculator calculator, Parameter parameter) {
        this.calculator = calculator;
        this.parameter = parameter;
    }

    public void result() throws Exception {
        calculator.result(parameter);
    }
}
