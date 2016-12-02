package com.代理模式.计算器;


class IOperationFactory implements IOperation {
    private OperationImpl operation;

    IOperationFactory() {
        this.operation = new OperationImpl();
    }

    @Override
    public double div(double val1, double val2) throws Exception {
        if (0 == val2) {
            throw new Exception("除数不能为0");
        }
        return operation.div(val1, val2);
    }
}
