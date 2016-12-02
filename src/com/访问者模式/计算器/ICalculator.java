package com.访问者模式.计算器;

public interface ICalculator {
    double visit(Add add, Parameter parameter);

    double visit(Sub sub, Parameter parameter);
}
