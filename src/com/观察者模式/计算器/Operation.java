package com.观察者模式.计算器;

/**
 * 抽象观察者
 */
public abstract class Operation {
    
    abstract double result(double val1, double val2) throws Exception;
}
