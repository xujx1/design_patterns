package com.简单工厂模式.计算器;

/**
 * Created by xujinxin on 2016/11/17.
 * 这是除法类
 */
class Div extends Operation {

    Div(double val1, double val2) {
        super(val1, val2);
    }

    @Override
    double result() throws Exception {
        if (0 == this.val2) {
            throw new Exception("除数不能为0");
        }
        return val1 / val2;
    }
}
