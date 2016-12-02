package com.备忘录模式.计算器;


import java.lang.reflect.Field;

/**
 * 计算器的加法操作
 */
public class Add extends OperationLog {

    @Override
    public double result() throws Exception {
        double result = 0.0;
        Parameter parameter = super.getParameter();
        Field[] fields = parameter.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            field.getName();
            result += (Double) field.get(parameter);
        }
        return result;
    }
}
