package com.策略模式.计算器;

class OperationFactory {
    static double createOperation(Operation operate) throws Exception {
        return operate.result();
    }
}
