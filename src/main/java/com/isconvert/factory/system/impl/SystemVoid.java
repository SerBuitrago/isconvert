package com.isconvert.factory.system.impl;

import com.isconvert.factory.system.ISystem;
import com.isconvert.factory.system.generic.SystemGeneric;

public class SystemVoid <T> extends SystemGeneric implements ISystem<T> {

    @Override
    public String toBinary(T number) throws Exception {
        throw new Exception("Error binary!");
    }

    @Override
    public Long toOctal(T number) throws Exception {
        throw new Exception("Error octal!");
    }

    @Override
    public Long toDecimal(T number) throws Exception {
        throw new Exception("Error decimal!");
    }

    @Override
    public String toHexadecimal(T number) throws Exception {
        throw new Exception("Error hexadecimal!");
    }
}
