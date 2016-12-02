package com.桥接模式.计算器;

/**
 * 抽象观察者
 */
public interface IOperation {

    double result(double val1, double val2) throws Exception;
}
