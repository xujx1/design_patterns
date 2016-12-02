package com.代理模式.计算器;

class OperationImpl implements IOperation {

    @Override
    public double div(double val1, double val2) {
        return val1 / val2;
    }

}
