package com.isconvert.system.impl;

import com.isconvert.system.ISystem;

import java.math.BigInteger;

public class SystemVoid  <T> implements ISystem<T> {
    @Override
    public String toBinary(T number) {
        return null;
    }

    @Override
    public BigInteger toTernary(T number) {
        return null;
    }

    @Override
    public BigInteger toOctal(T number) {
        return null;
    }

    @Override
    public BigInteger toDecimal(T number) {
        return null;
    }

    @Override
    public String toHexadecimal(T number) {
        return null;
    }
}
