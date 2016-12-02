package com.迭代器模式.计算器模式;

public class Main {
    public static void main(String[] args) throws Exception {
        IOperationGroup operationGroup = new OperationGroup();
        IOperation operation = new Mul();
        operationGroup.add(new Add());
        operationGroup.add(new Div());
        operationGroup.add(new Sub());
        operationGroup.add(operation);
        operationGroup.remove(operation);

        Iterator iterator = operationGroup.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().result(1.0, 2.0));
        }
    }
}
