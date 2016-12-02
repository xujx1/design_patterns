package com.桥接模式.计算器;


class Calculator implements ICalculator {

    private IOperation IOperation;

    Calculator(IOperation operation) {
        this.IOperation = operation;
    }

    public double result(double val1, double val2) throws Exception {
        return IOperation.result(val1, val2);
    }
}
