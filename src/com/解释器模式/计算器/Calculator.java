package com.解释器模式.计算器;


class Calculator implements ICalculator {

    private IOperation operation;

    Calculator(IOperation operation) {
        this.operation = operation;
    }

    public double result(Parameter parameter) throws Exception {
        return operation.result(parameter);
    }
}
