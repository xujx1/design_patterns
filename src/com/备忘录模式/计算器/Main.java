package com.备忘录模式.计算器;

/**
 * 测试类
 */
public class Main {
    public static void main(String[] args) throws Exception {
        OperationLog operationLog = new Add();
        System.out.println(operationLog.result(new Parameter(1.0, 2.0)));
        Memento memento = operationLog.getMemento();
        System.out.println(memento);
        System.out.println(operationLog.result(new Parameter(3.0, 2.0)));
        operationLog.setMemento(memento);
        System.out.println(operationLog.getMemento());
    }
}
