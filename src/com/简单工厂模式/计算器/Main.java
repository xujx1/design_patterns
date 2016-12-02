package com.简单工厂模式.计算器;

/**
 * Created by xujinxin on 2016/11/17.
 * 这是简单工厂方法的测试类
 */
public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(OperationFactory.createOperation("+", 1, 2).result());
            System.out.println(OperationFactory.createOperation("-", 1, 2).result());
            System.out.println(OperationFactory.createOperation("*", 1, 2).result());
            System.out.println(OperationFactory.createOperation("/", 1, 2).result());
            System.out.println(OperationFactory.createOperation("/", 1, 0).result());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
