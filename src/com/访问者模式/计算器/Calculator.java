package com.访问者模式.计算器;

public class Calculator implements ICalculator {

    @Override
    public double visit(Add add, Parameter parameter) {
        return add.result(parameter);
    }

    @Override
    public double visit(Sub sub, Parameter parameter) {
        return sub.result(parameter);
    }
}
