package com.抽象工厂.计算器;

/**
 * 计算器B的减跟除的实现方式
 */
class CalculatorB extends CommonOperation implements IOperation {

    /**
     * 除
     */
    @Override
    public double div(double val1, double val2) throws Exception {
        if (0 == val1) {
            throw new Exception("除数不能为0");
        }
        return val2 / val1;
    }

    /**
     * 减
     */

    @Override
    public double sub(double val1, double val2) {
        return val2 - val1;
    }
}
