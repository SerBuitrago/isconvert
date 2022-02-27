package com.isconvert.factory.system.impl;

import com.isconvert.factory.system.ISystem;
import com.isconvert.factory.system.generic.SystemGeneric;


import static com.isconvert.util.SystemUtil.*;

public class SystemDecimal extends SystemGeneric implements ISystem<Long> {

    private final SystemBinary systemBinary;

    public SystemDecimal(){
        systemBinary= new SystemBinary();
    }

    @Override
    public String toBinary(Long number) {
        if(binary != null)
            return binary;
        binary = "";
        while (number > 0){
            binary = (number % BINARY_BASE) +binary;
            number/=BINARY_BASE;
        }
        return binary;
    }

    @Override
    public Long toOctal(Long number) {
        if(octal != null)
            return octal;
        octal =  systemBinary.toOctal(toBinary(number));
        return octal;
    }

    @Override
    public Long toDecimal(Long number) {
        return number;
    }

    @Override
    public String toHexadecimal(Long number) {
        if(hexadecimal != null)
            return hexadecimal;
        hexadecimal = systemBinary.toHexadecimal(toBinary(number));
        return hexadecimal;
    }
}
