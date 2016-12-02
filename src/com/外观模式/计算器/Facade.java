package com.外观模式.计算器;

/**
 * Created by xujinxin on 2016/11/22.
 */
class Facade {
    private Operation operationAdd;
    private Operation operationMul;
    private Operation operationSub;
    private Operation operationDiv;

    Facade() {
        if (null == operationAdd) {
            operationAdd = new Add();
        }
        if (null == operationMul) {
            operationMul = new Mul();
        }
        if (null == operationSub) {
            operationSub = new Sub();
        }
        if (null == operationDiv) {
            operationDiv = new Div();
        }
    }

    void result(double val1, double val2) throws Exception {
        System.out.println(operationAdd.result(val1, val2));
        System.out.println(operationMul.result(val1, val2));
        System.out.println(operationSub.result(val1, val2));
        System.out.println(operationDiv.result(val1, val2));
    }
}
