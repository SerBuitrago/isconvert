package com.isconvert.factory;

import static com.isconvert.util.SystemUtil.*;

public enum FactorySystemType {

    BINARY(BINARY_BASE),
    OCTAL(OCTAL_BASE),
    DECIMAL(DECIMAL_BASE),
    HEXADECIMAL(HEXADECIMAL_BASE);

    private Integer base;

    FactorySystemType(Integer base){
        this.base = base;
    }

    public Integer getBase(){
        return base;
    }
}
