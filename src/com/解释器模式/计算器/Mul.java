package com.解释器模式.计算器;

/**
 * 这是乘法类
 */
class Mul implements IOperation {

    public double result(Parameter parameter) {
        return parameter.getVal1() * parameter.getVal2();
    }
}
