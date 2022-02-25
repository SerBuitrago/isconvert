package com.isconvert.factory;

public enum FactorySystemType {

    BINARY(2),
    TERNARY(3),
    OCTAL(8),
    DECIMAL(10),
    HEXADECIMAL(16);

    private Integer base;

    FactorySystemType(Integer base){
        this.base = base;
    }
}
