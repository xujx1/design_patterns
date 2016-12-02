package com.建造者模式.计算器;


enum Mark {
    Add(Add.class),
    Div(Div.class),
    Mul(Mul.class),
    Sub(Sub.class);

    private Class clazz;

    Mark(Class clazz) {
        this.clazz = clazz;
    }

    public Class getClazz() {
        return clazz;
    }

    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }
}
