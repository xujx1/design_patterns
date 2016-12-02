package com.迭代器模式.计算器模式;

interface Iterator {
    IOperation next();

    boolean hasNext();
}