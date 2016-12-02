package com.工厂模式.计算器;

/**
 * Created by xujinxin on 2016/11/17.
 * 这是简单工厂方法的测试类
 */
public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(new AddFactory().createOperation(1, 2).result());
            System.out.println(new MulFactory().createOperation(1, 2).result());
            System.out.println(new DivFactory().createOperation(1, 2).result());
            System.out.println(new SubFactory().createOperation(1, 2).result());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
