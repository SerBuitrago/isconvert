package com.isconvert.factory.system.impl;

import com.isconvert.factory.system.ISystem;

public class SystemVoid  <T> implements ISystem<T> {

    @Override
    public String toBinary(T number) {
        return null;
    }

    @Override
    public Long toOctal(T number) {
        return null;
    }

    @Override
    public Long toDecimal(T number) {
        return null;
    }

    @Override
    public String toHexadecimal(T number) {
        return null;
    }
}
