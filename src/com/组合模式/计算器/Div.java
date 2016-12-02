package com.组合模式.计算器;

/**
 * Created by xujinxin on 2016/11/17.
 * 这是除法类
 */
class Div extends Operation {
    @Override
    double result(double val1, double val2) throws Exception {
        if (0 == val2) {
            throw new Exception("除数不能为0");
        }
        return val1 / val2;
    }
}
