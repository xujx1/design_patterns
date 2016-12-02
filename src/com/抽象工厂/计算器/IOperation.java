package com.抽象工厂.计算器;

/**
 * 计算器通用操作抽象类
 */
interface IOperation {

    /**
     * 增
     */

    double add(double val1, double val2);

    /**
     * 除
     */

    double div(double val1, double val2) throws Exception;

    /**
     * 乘
     */

    double mul(double val1, double val2);

    /**
     * 减
     */

    double sub(double val1, double val2);
}
