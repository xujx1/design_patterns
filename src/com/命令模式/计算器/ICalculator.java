package com.命令模式.计算器;


interface ICalculator {
    //完成计算器操作
    void result(Parameter parameter) throws Exception;
    //增加计算器操作
    void add(IOperation operation);
    //移除计算器操作
    void remove(IOperation operation);
}
