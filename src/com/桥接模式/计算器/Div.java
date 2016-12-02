package com.桥接模式.计算器;

/**
 * 这是除法类
 */
class Div implements IOperation {

    public double result(double val1, double val2) throws Exception {
        if (0 == val2) {
            throw new Exception("除数不能为0");
        }
        return val1 / val2;
    }
}
