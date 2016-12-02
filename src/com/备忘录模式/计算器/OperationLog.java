package com.备忘录模式.计算器;


abstract class OperationLog {

    private Parameter parameter;
    private Memento memento;

    public double result(Parameter parameter) throws Exception {
        this.parameter = parameter;
        this.memento = new Memento(parameter);

        return result();
    }

    public abstract double result() throws Exception;

    Parameter getParameter() {
        return parameter;
    }

    Memento getMemento() {
        return memento;
    }

    void setMemento(Memento memento) {
        this.memento = memento;
    }
}
