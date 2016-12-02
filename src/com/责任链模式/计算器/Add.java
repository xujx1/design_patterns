package com.责任链模式.计算器;

/**
 * Created by xujinxin on 2016/11/17.
 * 这是加法类
 */
class Add extends Operation {

    @Override
    double result(Parameter parameter) throws Exception {
        return parameter.getVal1() + parameter.getVal2();
    }
}
