package com.工厂模式.计算器;

interface OperationFactory {
    Operation createOperation(int val1, int val2);
}
