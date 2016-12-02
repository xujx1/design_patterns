package com.享元模式.计算器;

/**
 * Created by xujinxin on 2016/11/17.
 * 这是减法类
 */
class Sub extends Operation {

    @Override
    double result(Parameter parameter) throws Exception {
        return parameter.getVal1() - parameter.getVal2();
    }
}
