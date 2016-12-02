package com.迭代器模式.计算器模式;


import java.util.List;

class OperationIterator implements Iterator {

    private List<IOperation> operations;
    private int location = 0;


    OperationIterator(List<IOperation> operations) {
        this.operations = operations;
    }


    @Override
    public IOperation next() {
        IOperation operation = null;
        if (hasNext()) {
            operation = operations.get(location++);
        }
        return operation;
    }

    @Override
    public boolean hasNext() {
        return location != operations.size();
    }
}
