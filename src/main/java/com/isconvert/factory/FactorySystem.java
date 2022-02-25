package com.isconvert.factory;

import com.isconvert.system.ISystem;
import com.isconvert.system.impl.*;

public class FactorySystem<T> {

    public ISystem<T> system(FactorySystemType systemType){
        if(systemType == null)
            return new SystemVoid<>();
        ISystem<T> system = null;
        switch (systemType){
            case BINARY:
                system = (ISystem<T>) new SystemBinary();
                break;
            case TERNARY:
                system = (ISystem<T>) new SystemTernary();
                break;
            case OCTAL:
                system = (ISystem<T>) new SystemOctal();
                break;
            case DECIMAL:
                system = (ISystem<T>) new SystemDecimal();
                break;
            case HEXADECIMAL:
                system = (ISystem<T>) new SystemHexadecimal();
                break;
            default:
                system = new SystemVoid<>();
                break;
        }
        return system;
    }
}
