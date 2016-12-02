package com.建造者模式.计算器;


public class Main {
    public static void main(String[] args) {
        new Parameter.Builder().operation(Mark.Add).val1(1).val2(2).builder();
        new Parameter.Builder().operation(Mark.Div).val1(1).val2(2).builder();
        new Parameter.Builder().operation(Mark.Mul).val1(1).val2(2).builder();
        new Parameter.Builder().operation(Mark.Sub).val1(1).val2(2).builder();
    }
}
