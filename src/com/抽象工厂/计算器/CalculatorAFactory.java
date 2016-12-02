package com.抽象工厂.计算器;

/**
 * 专门生产A计算器的公司
 */
 class CalculatorAFactory implements ICalculatorFactory {

    @Override
    public IOperation createCalculator() {
        return new CalculatorA();
    }
}
