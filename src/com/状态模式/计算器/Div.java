package com.状态模式.计算器;


/**
 * 这是除法类
 */

class Div implements IOperation {

    @Override
    public double result(double val1, double val2) throws Exception {
        if (0 == val2) {
            throw new Exception("除数不能为0");
        }
        return val1 / val2;
    }
}
