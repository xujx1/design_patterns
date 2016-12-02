package com.工厂模式.计算器;


public class AddFactory implements OperationFactory {

    @Override
    public Operation createOperation(int val1, int val2) {
        return new Add(val1, val2);
    }
}
