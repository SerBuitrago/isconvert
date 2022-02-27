package com.isconvert.observer.observer.generic;

import com.isconvert.factory.FactorySystem;
import com.isconvert.factory.FactorySystemType;
import com.isconvert.observer.observer.ObserverSystem;
import com.isconvert.observer.subject.SubjectSystem;
import com.isconvert.factory.system.ISystem;

public abstract class ObserverSystemGeneric<T> extends ObserverSystem<T> {

    public ObserverSystemGeneric(SubjectSystem<T> subject, FactorySystemType systemType){
        this.subject = subject;
        this.systemType = systemType;
        this.subject.add(this);
    }

    @Override
    public void update() throws Exception {
        if(!isValid())
            return;
        FactorySystem<T> factory = new FactorySystem<>();
        ISystem<T> system = factory.system(this.systemType);
        System.out.println("Binary: "+system.toBinary(this.subject.getStatus()));
        System.out.println("Octal: "+system.toOctal(this.subject.getStatus()));
        System.out.println("Decimal: "+system.toDecimal(this.subject.getStatus()));
        System.out.println("Hexadecimal: "+system.toHexadecimal(this.subject.getStatus()));
    }

    public abstract boolean isValid();
}
