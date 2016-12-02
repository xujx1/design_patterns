package com.迭代器模式.计算器模式;

import java.util.ArrayList;
import java.util.List;

class OperationGroup implements IOperationGroup {

    private List<IOperation> operations = new ArrayList<>();

    @Override
    public void add(IOperation operation) {
        operations.add(operation);
    }

    @Override
    public void remove(IOperation operation) {
        operations.remove(operation);
    }

    @Override
    public Iterator iterator() {
        return new OperationIterator(operations);
    }
}
