package com.装饰模式.计算器;

/**
 * Created by xujinxin on 2016/11/17.
 * 这是加法类
 */
 class Add extends OperationLog {

    Add(double val1, double val2) {
        super(val1, val2);
    }

    @Override
    double result() {
        return this.val1 + this.val2;
    }
}
