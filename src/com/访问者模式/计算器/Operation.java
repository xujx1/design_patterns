package com.访问者模式.计算器;

public abstract class Operation {
    public abstract double result(Parameter parameter);

    //访问方法
    public abstract double accept(ICalculator calculator, Parameter parameter);
}
