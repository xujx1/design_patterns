package com.装饰模式.计算器;

class OperationFactory {
    static double createOperation(OperationLog operate) throws Exception {
        return operate.result();
    }
}
