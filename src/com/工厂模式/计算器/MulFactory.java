package com.工厂模式.计算器;

/**
 * Created by xujinxin on 2016/11/22.
 */
public class MulFactory implements OperationFactory {

    @Override
    public Operation createOperation(int val1, int val2) {
        return new Mul(val1, val2);
    }
}
