package com.访问者模式.计算器;

/**
 * 这是减法类
 */
class Sub extends Operation {

    @Override
    public double result(Parameter parameter) {
        return parameter.getVal1() - parameter.getVal2();
    }

    @Override
    public double accept(ICalculator calculator, Parameter parameter) {
        return calculator.visit(this, parameter);
    }
}
