package com.isconvert.factory.system.impl;

import com.isconvert.factory.system.ISystem;

public class SystemDecimal implements ISystem<Long> {

    @Override
    public String toBinary(Long number) {
        return "Hola";
    }

    @Override
    public Long toOctal(Long number) {
        return number;
    }

    @Override
    public Long toDecimal(Long number) {
        return number;
    }

    @Override
    public String toHexadecimal(Long number) {
        return "ss";
    }
}
