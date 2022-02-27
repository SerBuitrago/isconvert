package com.isconvert.factory.system.impl;

import com.isconvert.factory.system.ISystem;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

import static com.isconvert.util.SystemUtil.*;

public class SystemBinary implements ISystem<String> {

    @Override
    public String toBinary(String number) {
        return number;
    }

    @Override
    public Long toOctal(String number) {
        AtomicReference<String> octal = new AtomicReference<>("");
        Arrays.stream(countGroupAndAdd(number, OCTAL_GROUP_VALUE, ADD_VALUE, true))
                .forEach(group -> octal.updateAndGet(value -> value + findArray(OCTAL_GROUP, group)));
        return Long.parseLong(octal.get());
    }

    @Override
    public Long toDecimal(String number) {
        Long decimal = 0L;
        Double exponent = 0D;
        for(char indexNumber : flip(number).toCharArray())
            decimal += pow(Double.parseDouble(String.valueOf(indexNumber)), exponent++);
        return decimal;
    }

    @Override
    public String toHexadecimal(String number) {
        AtomicReference<String> hexadecimal = new AtomicReference<>("");
        Arrays.stream(countGroupAndAdd(number, HEXADECIMAL_GROUP_VALUE, ADD_VALUE, true))
                .forEach(group -> {
                    Integer index = findArray(HEXADECIMAL_GROUP, group);
                    hexadecimal.updateAndGet(value -> value + HEXADECIMAL_VALUE.charAt(index));
                });
        return hexadecimal.get();
    }

    private Long pow(Double base, Double exponent){
        return  (base == 0D) ? 0 : (long) Math.pow(BINARY_BASE, exponent);
    }
}
