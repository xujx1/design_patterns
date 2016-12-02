package com.责任链模式.计算器;

public abstract class Operation {

    abstract double result(Parameter parameter) throws Exception;

    double next(Operation operation, Parameter parameter) throws Exception {
        return operation.result(parameter);
    }
}
