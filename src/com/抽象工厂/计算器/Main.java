package com.抽象工厂.计算器;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 测试类
 */
public class Main {

    public static void main(String[] args) throws Exception {
        //实例化计算器操作
        IOperation operationA = CalculatorAFactory.class.newInstance().createCalculator().getClass().newInstance();
        IOperation operationB = CalculatorBFactory.class.newInstance().createCalculator().getClass().newInstance();
        //获取A，B两种计算器非继承自Object的方法
        List<Method> methodA = new ArrayList<>(Arrays.asList(operationA.getClass().getMethods()));
        List<Method> methodB = new ArrayList<>(Arrays.asList(operationB.getClass().getMethods()));
        List<Method> methodO = new ArrayList<>(Arrays.asList(Object.class.getMethods()));
        methodA.removeAll(methodO);
        methodB.removeAll(methodO);

        double VAL2 = 2.0;
        double VAL1 = 1.0;
        for (Method method : methodA) {
            System.out.println(method.getName() + ":" + method.invoke(operationA, VAL1, VAL2));
        }
        for (Method method : methodB) {
            System.out.println(method.getName() + ":" + method.invoke(operationB, VAL1, VAL2));
        }
    }
}
