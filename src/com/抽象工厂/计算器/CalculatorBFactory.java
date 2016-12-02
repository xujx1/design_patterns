package com.抽象工厂.计算器;

/**
 * 专门生产B计算器的公司
 */
class CalculatorBFactory implements ICalculatorFactory {
    @Override
    public IOperation createCalculator() {
        return new CalculatorB();
    }
}
