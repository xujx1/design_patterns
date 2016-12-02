package com.单例模式.计算器;

/**
 * 单例模式
 */
public class Singleton {

    /**
     * 饿汉式 单例模式
     * 类在加载时就实例化，
     * 提供一个公共的方法获取实例化的类
     * <p>
     * 优点：线程安全
     * <p>
     * 缺点：类被加载时就实例化，
     * 有可能在整个代码周期都没有使用
     * 且不会被回收，会一直存在
     */
    private static class 饿汉式 {
        private static 饿汉式 饿汉式 = new 饿汉式();

        private 饿汉式() {

        }

        static 饿汉式 get饿汉式() {
            return 饿汉式;
        }
    }


    /**
     * 懒汉式 单例模式
     * 只有在真正使用的时候，才实例化
     * <p>
     * 优点：只有在真正使用的时候才实例化
     * <p>
     * 缺点：线程不安全
     */
    private static class 懒汉式 {
        private static 懒汉式 懒汉式;

        private 懒汉式() {

        }

        static synchronized 懒汉式 get懒汉式() {
            if (null == 懒汉式) {
                懒汉式 = new 懒汉式();
            }
            return 懒汉式;
        }
    }

    /**
     * 枚举式 单例模式
     * 跟 饿汉式 一样
     */

    private enum 枚举式 {
        枚举式;

        public 枚举式 get枚举式() {
            return 枚举式;
        }
    }

    public static void main(String[] args) {
        Singleton.懒汉式 懒汉式 = Singleton.懒汉式.get懒汉式();
        if (懒汉式 == Singleton.懒汉式.get懒汉式()) {
            System.out.println("懒汉式--单例生效");
        }

        Singleton.饿汉式 饿汉式 = Singleton.饿汉式.get饿汉式();


        if (饿汉式 == Singleton.饿汉式.get饿汉式()) {
            System.out.println("饿汉式--单例生效");
        }

        if (枚举式.枚举式.get枚举式() == 枚举式.枚举式.get枚举式()) {
            System.out.println("枚举式--单例生效");
        }
    }
}
