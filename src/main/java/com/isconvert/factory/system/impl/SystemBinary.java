package com.isconvert.factory.system.impl;

import com.isconvert.factory.system.ISystem;
import com.isconvert.factory.system.generic.SystemGeneric;

import java.util.Arrays;

import static com.isconvert.util.SystemUtil.*;

public class SystemBinary extends SystemGeneric implements ISystem<String> {

    @Override
    public String toBinary(String number) {
        return number;
    }

    @Override
    public Long toOctal(String number) {
        if(octal != null)
            return octal;
        test = "";
        Arrays.stream(countGroupAndAdd(number, OCTAL_GROUP_VALUE, ADD_VALUE, true))
                .forEach(group -> test+= findArray(OCTAL_GROUP, group));
        octal = Long.parseLong(test);
        test = null;
        return octal;
    }

    @Override
    public Long toDecimal(String number) {
        if(decimal != null)
            return decimal;
        decimal = 0L;
        Double exponent = 0D;
        for(char indexNumber : flip(number).toCharArray())
            decimal += pow(Double.parseDouble(String.valueOf(indexNumber)), exponent++);
        return decimal;
    }

    @Override
    public String toHexadecimal(String number) {
        if(hexadecimal != null)
            return  hexadecimal;
        hexadecimal = "";
        Arrays.stream(countGroupAndAdd(number, HEXADECIMAL_GROUP_VALUE, ADD_VALUE, true))
                .forEach(group -> {
                    Integer index = findArray(HEXADECIMAL_GROUP, group);
                    hexadecimal += HEXADECIMAL_VALUE.charAt(index);
                });
        return hexadecimal;
    }

    private Long pow(Double base, Double exponent){
        return  (base == 0D) ? 0 : (long) Math.pow(BINARY_BASE, exponent);
    }
}
