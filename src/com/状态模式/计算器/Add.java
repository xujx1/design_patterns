package com.状态模式.计算器;

/**
 * 计算器的加法操作
 */
public class Add implements IOperation {
    @Override
    public double result(double val1, double val2) throws Exception {
        return val1 + val2;
    }
}
