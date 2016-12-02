package com.备忘录模式.计算器;

/**
 * 备忘类用来记录入参
 */
class Memento {
    private Parameter parameter;


    Memento(Parameter parameter) {
        this.parameter = parameter;
    }


    public Parameter getParameter() {
        return parameter;
    }

    public void setParameter(Parameter parameter) {
        this.parameter = parameter;
    }

    @Override
    public String toString() {
        return "Memento{" +
                "parameter=" + parameter +
                '}';
    }
}
