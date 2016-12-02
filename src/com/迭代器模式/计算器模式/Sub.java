package com.迭代器模式.计算器模式;


/**
 * 这是减法类
 */
class Sub implements IOperation {

    @Override
    public double result(double val1, double val2) {
        return val1 - val2;
    }
}
