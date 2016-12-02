package com.迭代器模式.计算器模式;

/**
 * 计算器基本操作的抽象类
 */
public interface IOperation {

    double result(double val1, double val2) throws Exception;
}
