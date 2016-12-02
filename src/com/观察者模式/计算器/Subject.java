package com.观察者模式.计算器;

import java.util.List;

/**
 * 通知类
 */
class Subject {

    private List<Operation> operations;

    Subject(List<Operation> operations) {
        this.operations = operations;
    }

    void addOperation(Operation operation) {
        operations.add(operation);
    }

    void removeOperation(Operation operation) {
        if (operations.contains(operation)) {
            operations.remove(operation);
        }
    }

    void result(int val1, int val2) throws Exception {
        for (Operation operation : operations) {
            System.out.println("操作:" + operation.getClass().getSimpleName() + "，结果:" + operation.result(val1, val2));
        }
    }
}
