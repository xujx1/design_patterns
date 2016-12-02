package com.适配器模式.计算器;


/**
 * 这是乘法类
 */
class Mul implements IOperation {

    @Override
    public double result(double val1, double val2) throws Exception {
        return val1 * val2;
    }
}
