package com.桥接模式.计算器;

/**
 * 这是加法类
 */
class Add implements IOperation {

    public double result(double val1, double val2) {
        return val1 + val2;
    }
}
