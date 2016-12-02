package com.装饰模式.计算器;

class OperationLog extends Operation {

    OperationLog(double val1, double val2) {
        super(val1, val2);
        System.out.println("val1:" + this.val1 + "---" + getClass().getSimpleName() + "---val2:" + this.val2);
    }

    @Override
    double result() throws Exception {
        return super.result();
    }
}
