package com.组合模式.计算器;

/**
 * Created by xujinxin on 2016/11/17.
 * 这是加法类
 */
class Add extends Operation {

    @Override
    double result(double val1, double val2) {
        return val1 + val2;
    }
}
