package com.原型模式.计算器;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 创建一个对象有五种方式
 * 1。使用new 关键字：new Calculator("1", "a")
 * 2。使用Class类的newInstance方法:(Calculator) (Class.forName("com.原型模式.计算器.Calculator").getDeclaredConstructor(String.class, String.class)).newInstance("3", "c");
 * 3。使用Constructor类的newInstance方法:Calculator.class.getDeclaredConstructor(String.class, String.class).newInstance("4", "d");
 * 4。使用clone方法：(Calculator) calculator1.clone()
 * 5。使用反序列话方法：(Calculator) (new ObjectInputStream(new FileInputStream("data")).readObject())
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Calculator calculator1 = new Calculator("1", "a", new Calculator.CalculatorColor("A"));

        Calculator calculator2 = (Calculator) (Class.forName("com.原型模式.计算器.Calculator").getDeclaredConstructor(String.class, String.class, Calculator.CalculatorColor.class)).newInstance("2", "b", new Calculator.CalculatorColor("B"));
        calculator2.setName("b");
        calculator2.setId("2");

        Calculator calculator3 = Calculator.class.getDeclaredConstructor(String.class, String.class, Calculator.CalculatorColor.class).newInstance("3", "c", new Calculator.CalculatorColor("C"));

        Calculator calculator4 = (Calculator) calculator1.clone();
        calculator4.setId("4");
        calculator4.setName("d");
        calculator1.setCalculatorColor(new Calculator.CalculatorColor("D"));
        //将calculator4序列化进data
        new ObjectOutputStream(new FileOutputStream("data")).writeObject(calculator4);
        //从data反序列化出calculator5对象

        Calculator calculator5 = (Calculator) (new ObjectInputStream(new FileInputStream("data")).readObject());
        calculator5.setId("5");
        calculator5.setName("e");

        System.out.println(calculator1);
        System.out.println(calculator2);
        System.out.println(calculator3);
        System.out.println(calculator4);
        System.out.println(calculator5);
    }
}
