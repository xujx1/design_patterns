package com.责任链模式.计算器;

/**
 * Created by xujinxin on 2016/11/17.
 * 这是除法类
 */
class Div extends Operation {

    @Override
    double result(Parameter parameter) throws Exception {
        if (0 == parameter.getVal2()) {
            throw new Exception("除数不能为0");
        }
        return parameter.getVal1() / parameter.getVal2();
    }
}
