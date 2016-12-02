package com.简单工厂模式.计算器;

class OperationFactory {
    static Operation createOperation(String operate, double val1, double val2) throws Exception {
        switch (operate) {
            case "+":
                return new Add(val1, val2);
            case "-":
                return new Sub(val1, val2);
            case "*":
                return new Mul(val1, val2);
            case "/":
                return new Div(val1, val2);
        }
        throw new Exception("请输入正确的运算符合");
    }
}
