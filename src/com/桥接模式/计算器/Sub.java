package com.桥接模式.计算器;

/**
 * 这是减法类
 */
class Sub implements IOperation {

    public double result(double val1, double val2) {
        return val1 - val2;
    }
}
