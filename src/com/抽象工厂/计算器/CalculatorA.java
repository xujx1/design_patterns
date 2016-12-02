package com.抽象工厂.计算器;

/**
 * 计算器A的减跟除的实现方式
 */
class CalculatorA extends CommonOperation implements IOperation {

    /**
     * 除
     */
    @Override
    public double div(double val1, double val2) throws Exception {
        if (0 == val2) {
            throw new Exception("除数不能为0");
        }
        return val1 / val2;
    }

    /**
     * 减
     */

    @Override
    public double sub(double val1, double val2) {
        return val1 - val2;
    }
}
