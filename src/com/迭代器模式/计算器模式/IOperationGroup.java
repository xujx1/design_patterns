package com.迭代器模式.计算器模式;


interface IOperationGroup {
    void add(IOperation operation);

    void remove(IOperation operation);

    Iterator iterator();
}
