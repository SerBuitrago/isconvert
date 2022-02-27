package com.isconvert.factory.system;

public interface ISystem<T> {

    String toBinary(T number);

    Long toOctal(T number);

    Long toDecimal(T number);

    String toHexadecimal(T number);
}
