package com.适配器模式.计算器;

/**
 * 计算器基本操作的抽象类
 */
public interface IOperation {

    double result(double val1, double val2) throws Exception;

    //适配只输入一个数字的
    default double result(double val) throws Exception {
        return result(0, val);
    }
}
