package com.中介者模式.计算器;

/**
 * 这是加法类
 */
class Add implements IOperation {

    public double result(double val1, double val2) {
        return val1 + val2;
    }
}
