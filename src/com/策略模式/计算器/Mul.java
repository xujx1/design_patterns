package com.策略模式.计算器;

/**
 * Created by xujinxin on 2016/11/17.
 * 这是乘法类
 */
class Mul extends Operation {

    Mul(double val1, double val2) {
        super(val1, val2);
    }

    @Override
    double result() {
        return this.val1 * this.val2;
    }
}
