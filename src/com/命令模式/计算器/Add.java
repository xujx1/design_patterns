package com.命令模式.计算器;

import java.lang.reflect.Field;

/**
 * 这是加法类
 */
class Add implements IOperation {

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
