package com.isconvert.factory.system.impl;

import com.isconvert.factory.system.ISystem;
import com.isconvert.factory.system.generic.SystemGeneric;

import java.util.Arrays;

import static com.isconvert.util.SystemUtil.*;

public class SystemHexadecimal extends SystemGeneric implements ISystem<String>{

    private final SystemBinary systemBinary;

    public SystemHexadecimal(){
        systemBinary= new SystemBinary();
    }

    @Override
    public String toBinary(String number) {
        if(binary != null)
            return binary;
        binary = "";
        Arrays.stream(toArray(String.valueOf(number))).forEach(numberIndex -> {
            Integer index = HEXADECIMAL_VALUE.indexOf(numberIndex);
            binary += HEXADECIMAL_GROUP[index];
        });
        return binary;
    }

    @Override
    public Long toOctal(String number) {
        if(octal != null)
            return octal;
        octal = systemBinary.toOctal(toBinary(number));
        return octal;
    }

    @Override
    public Long toDecimal(String number) {
        if(decimal != null)
            return decimal;
        decimal = systemBinary.toDecimal(toBinary(number));
        return decimal;
    }

    @Override
    public String toHexadecimal(String number) {
        hexadecimal = number;
        return hexadecimal;
    }
}
