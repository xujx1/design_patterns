package com.组合模式.计算器;

/**
 * Created by xujinxin on 2016/11/17.
 * 这是乘法类
 */
class Mul extends Operation {

    @Override
    double result(double val1, double val2) {
        return val1 * val2;
    }
}
