package com.解释器模式.计算器;

/**
 * 这是减法类
 */
class Sub implements IOperation {

    public double result(Parameter parameter) {
        return parameter.getVal1() - parameter.getVal2();
    }
}
