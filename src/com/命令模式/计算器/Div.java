package com.命令模式.计算器;

/**
 * 这是除法类
 */
class Div implements IOperation {

    public double result(Parameter parameter) {
        if (0 == parameter.getVal2()) {
            try {
                throw new Exception("除数不能为0");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return parameter.getVal1() / parameter.getVal2();
    }
}
