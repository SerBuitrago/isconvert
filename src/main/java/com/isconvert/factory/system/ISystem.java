package com.isconvert.factory.system;

public interface ISystem<T> {

    String toBinary(T number) throws Exception;

    Long toOctal(T number) throws Exception;

    Long toDecimal(T number) throws Exception;

    String toHexadecimal(T number) throws Exception;
}
