package com.isconvert.factory.system.impl;

import com.isconvert.factory.system.ISystem;
import com.isconvert.factory.system.generic.SystemGeneric;

import java.util.Arrays;

import static com.isconvert.util.SystemUtil.*;

public class SystemOctal extends SystemGeneric implements ISystem<Long> {

    private final SystemBinary systemBinary;

    public SystemOctal(){
        systemBinary= new SystemBinary();
    }

    @Override
    public String toBinary(Long number) {
        if(binary != null)
            return binary;
        binary = "";
        Arrays.stream(toArray(String.valueOf(number))).forEach(numberIndex -> {
            Integer index = OCTAL_VALUE.indexOf(numberIndex);
            binary += OCTAL_GROUP[index];
        });
        return binary;
    }

    @Override
    public Long toOctal(Long number) {
        return number;
    }

    @Override
    public Long toDecimal(Long number) {
        if(decimal != null)
            return decimal;
        decimal = systemBinary.toDecimal(toBinary(number));
        return decimal;
    }

    @Override
    public String toHexadecimal(Long number) {
        if(hexadecimal != null)
            return hexadecimal;
        hexadecimal = systemBinary.toHexadecimal(toBinary(number));
        return hexadecimal;
    }
}
