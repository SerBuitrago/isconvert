package com.isconvert.system.impl;

import com.isconvert.system.ISystem;

import java.math.BigInteger;

public class SystemHexadecimal implements ISystem<String> {
    @Override
    public String toBinary(String number) {
        return number;
    }

    @Override
    public BigInteger toTernary(String number) {
        return BigInteger.ZERO;
    }

    @Override
    public BigInteger toOctal(String number) {
        return BigInteger.ZERO;
    }

    @Override
    public BigInteger toDecimal(String number) {
        return BigInteger.ZERO;
    }

    @Override
    public String toHexadecimal(String number) {
        return number;
    }
}
