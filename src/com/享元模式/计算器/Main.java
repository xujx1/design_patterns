package com.享元模式.计算器;

/**
 * Created by xujinxin on 2016/12/2.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        OperationFactory operationFactory = new OperationFactory();
        Operation add = operationFactory.getOperation(Add.class);
        Operation div = operationFactory.getOperation(Div.class);
        Operation mul = operationFactory.getOperation(Mul.class);
        Operation sub = operationFactory.getOperation(Sub.class);

        System.out.println(add.result(new Parameter(1.0, 2.0)));
        System.out.println(div.result(new Parameter(1.0, 2.0)));
        System.out.println(mul.result(new Parameter(1.0, 2.0)));
        System.out.println(sub.result(new Parameter(1.0, 2.0)));
        System.out.println(operationFactory.getOperation(Add.class) == add);
        System.out.println(operationFactory.getOperation(Div.class) == div);
        System.out.println(operationFactory.getOperation(Mul.class) == mul);
        System.out.println(operationFactory.getOperation(Sub.class) == sub);
    }
}
