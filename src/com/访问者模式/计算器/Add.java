package com.访问者模式.计算器;


import java.lang.reflect.Field;

/**
 * 这是加法类
 */
class Add extends Operation {

    @Override
    public double accept(ICalculator calculator, Parameter parameter) {
        return calculator.visit(this, parameter);
    }

    public double result(Parameter parameter) {
        double result = 0.0;
        Field[] fields = parameter.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            field.getName();
            try {
                result += (Double) field.get(parameter);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}
