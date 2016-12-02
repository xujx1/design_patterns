package com.装饰模式.计算器;

/**
 * Created by xujinxin on 2016/11/17.
 */
class Operation {
    double val1;
    double val2;

    Operation(double val1, double val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    double result() throws Exception {
        return val1;
    }
}
