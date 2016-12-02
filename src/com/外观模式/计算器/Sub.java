package com.外观模式.计算器;

/**
 * Created by xujinxin on 2016/11/17.
 * 这是减法类
 */
class Sub implements Operation {

    public double result(double val1, double val2) {
        return val1 - val2;
    }
}
