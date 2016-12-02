package com.原型模式.计算器;

import java.io.Serializable;

/**
 * 这是计算器对象
 * Created by xujinxin on 2016/11/22.
 */
class Calculator implements Cloneable, Serializable {

    private static final long serialVersionUID = 4218157128019450169L;

    private String id = "";
    private String name = "";
    private CalculatorColor calculatorColor = new CalculatorColor("red");

    Calculator(String id, String name, CalculatorColor calculatorColor) throws Exception {
        this.id = id;
        this.name = name;
        this.calculatorColor = calculatorColor;
      /*  this.calculatorColor = (CalculatorColor) calculatorColor.clone();*/
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCalculatorColor(CalculatorColor calculatorColor) {
        this.calculatorColor = calculatorColor;
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", color='" + calculatorColor.getColor() + '\'' +
                '}';
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static class CalculatorColor implements Cloneable, Serializable {

        private static final long serialVersionUID = 459191030953297230L;

        private String color = "";

        CalculatorColor(String color) {
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }
}
