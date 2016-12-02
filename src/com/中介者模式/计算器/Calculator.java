package com.中介者模式.计算器;


class Calculator implements ICalculator {

    private IOperation add;
    private IOperation div;

    Calculator(IOperation add, IOperation div) {
        this.add = add;
        this.div = div;
    }

    public double result(double val1, double val2) throws Exception {
        double val = add.result(val1, val2);
        return div.result(val, val2);
    }
}
