package com.代理模式.计算器;


interface IOperation {
    default double add(double val1, double val2) {
        return val1 + val2;
    }

    default double mul(double val1, double val2) {
        return val1 * val2;
    }

    default double sub(double val1, double val2) {
        return val1 - val2;
    }

    double div(double val1, double val2) throws Exception;
}
