package com.代理模式.计算器;

/**
 * Created by xujinxin on 2016/11/22.
 */
public class Main {

    public static void main(String[] args) {
        try {
            System.out.println(new IOperationFactory().add(1, 2));
            System.out.println(new IOperationFactory().div(1, 2));
            System.out.println(new IOperationFactory().mul(1, 2));
            System.out.println(new IOperationFactory().sub(1, 2));
            System.out.println(new IOperationFactory().div(1, 0));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
