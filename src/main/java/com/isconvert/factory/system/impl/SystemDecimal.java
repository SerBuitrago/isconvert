package com.isconvert.factory.system.impl;

import com.isconvert.factory.system.ISystem;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

import static com.isconvert.util.SystemUtil.HEXADECIMAL_GROUP;
import static com.isconvert.util.SystemUtil.toArray;

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
        AtomicReference<String> hexadecimal = new AtomicReference<>("");
        Arrays.stream(toArray(String.valueOf(number))).forEach(numberIndex -> {
            Integer index = Integer.parseInt(numberIndex);
            hexadecimal.updateAndGet(value ->  value + HEXADECIMAL_GROUP[index]);
        });
        return hexadecimal.get();
    }
}
