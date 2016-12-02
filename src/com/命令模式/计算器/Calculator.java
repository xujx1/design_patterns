package com.命令模式.计算器;


import java.util.ArrayList;
import java.util.List;

class Calculator implements ICalculator {

    private List<IOperation> operations = new ArrayList<>();

    public void result(Parameter parameter) throws Exception {
        operations.forEach(operation -> System.out.println("操作:" + operation.getClass().getSimpleName() + " 结果:" + operation.result(parameter)));
    }

    @Override
    public void remove(IOperation operation) {
        operations.remove(operation);
    }

    @Override
    public void add(IOperation operation) {
        operations.add(operation);
    }
}
