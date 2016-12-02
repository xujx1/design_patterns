package com.装饰模式.计算器;

/**
 * Created by xujinxin on 2016/11/17.
 * 这是装饰模式加策略模式的实现方法
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
