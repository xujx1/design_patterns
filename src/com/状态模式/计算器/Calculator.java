package com.状态模式.计算器;


class Calculator {

    private IOperation operation;

    Calculator(IOperation operation) {
        this.operation = operation;
    }

    public double result(double val1, double val2) throws Exception {
        return operation.result(val1, val2);
    }
}
