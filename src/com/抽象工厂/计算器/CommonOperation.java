package com.抽象工厂.计算器;

/**
 * 计算器的操作实现类
 */
abstract class CommonOperation implements IOperation {

    /**
     * 增
     */

    @Override
    public double add(double val1, double val2) {
        return val1 + val2;
    }

    /**
     * 除
     */

    @Override
    public abstract double div(double val1, double val2) throws Exception;

    /**
     * 乘
     */

    @Override
    public double mul(double val1, double val2) {
        return val1 * val2;
    }

    /**
     * 减
     */

    @Override
    public abstract double sub(double val1, double val2);
}
