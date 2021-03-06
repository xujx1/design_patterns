package com.策略模式.计算器;

/**
 * Created by xujinxin on 2016/11/17.
 */
abstract class Operation {
    double val1;
    double val2;

    Operation(double val1, double val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    abstract double result() throws Exception;
}
