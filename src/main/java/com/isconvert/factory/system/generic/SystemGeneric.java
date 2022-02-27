package com.isconvert.factory.system.generic;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SystemGeneric {
    protected String binary;
    protected Long octal;
    protected Long decimal;
    protected String hexadecimal;
    protected String test;
}
