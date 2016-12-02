package com.抽象工厂.计算器;

/**
 * 计算器生产公司的抽象类
 */
interface ICalculatorFactory {
    IOperation createCalculator();
}
