package com.享元模式.计算器;


import java.util.Hashtable;
import java.util.Map;

public class OperationFactory {

    /**
     * 优点：线程安全
     * 缺点：慢
     * <p>
     * 在方法外的共有的对象要优先选择线程安全的
     */
    private Map<Class, Operation> hashtable = new Hashtable<Class, Operation>();

    Operation getOperation(Class clazz) throws Exception {
        Operation operation = null;
        if (null != clazz) {
            operation = hashtable.get(clazz);

            if (null == operation) {
                operation = createOperation(clazz);
                if (null != operation) {
                    hashtable.put(clazz, operation);
                }
            }
        }
        return operation;
    }

    private Operation createOperation(Class clazz) throws Exception {
        return (Operation) clazz.newInstance();
    }
}
