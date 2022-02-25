package com.isconvert.system.impl;

import com.isconvert.system.ISystem;

import java.math.BigInteger;

public class SystemOctal implements ISystem<Long> {

    @Override
    public String toBinary(Long number) {
        return String.valueOf(number);
    }

    @Override
    public BigInteger toTernary(Long number) {
        return BigInteger.ZERO;
    }

    @Override
    public BigInteger toOctal(Long number) {
        return BigInteger.ZERO;
    }

    @Override
    public BigInteger toDecimal(Long number) {
        return BigInteger.ZERO;
    }

    @Override
    public String toHexadecimal(Long number) {
        return String.valueOf(number);
    }
}
