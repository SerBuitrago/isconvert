package com.isconvert.system;

import java.math.BigInteger;

public interface ISystem<T> {

    String toBinary(T number);

    BigInteger toTernary(T number);

    BigInteger toOctal(T number);

    BigInteger toDecimal(T number);

    String toHexadecimal(T number);
}
