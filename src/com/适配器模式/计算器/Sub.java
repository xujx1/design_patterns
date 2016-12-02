package com.适配器模式.计算器;

/**
 * 这是减法类
 */
class Sub implements IOperation {

    @Override
    public double result(double val1, double val2) throws Exception {
        return val1 - val2;
    }
}
