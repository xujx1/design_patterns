package com.策略模式.计算器;

/**
 * Created by xujinxin on 2016/11/17.
 * 这是简单工厂方法的测试类
 */
public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(OperationFactory.createOperation(new Add(1, 2)));
            System.out.println(OperationFactory.createOperation(new Mul(1, 2)));
            System.out.println(OperationFactory.createOperation(new Div(1, 2)));
            System.out.println(OperationFactory.createOperation(new Sub(1, 2)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
