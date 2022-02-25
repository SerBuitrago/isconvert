package com.isconvert.start.observer.generic;

import com.isconvert.factory.FactorySystem;
import com.isconvert.factory.FactorySystemType;
import com.isconvert.start.observer.ObserverSystem;
import com.isconvert.start.subject.SubjectSystem;
import com.isconvert.system.ISystem;

public class ObserverSystemGeneric<T> extends ObserverSystem<T> {

    public ObserverSystemGeneric(SubjectSystem<T> subject, FactorySystemType systemType){
        this.subject = subject;
        this.systemType = systemType;
        this.subject.add(this);
    }

    @Override
    public void update() {
        FactorySystem<T> factory = new FactorySystem<>();
        ISystem<T> system = factory.system(this.systemType);
        System.out.println("Binary: "+system.toBinary(this.subject.getStatus()));
        System.out.println("Ternary: "+system.toTernary(this.subject.getStatus()));
        System.out.println("Octal: "+system.toOctal(this.subject.getStatus()));
        System.out.println("Decimal: "+system.toDecimal(this.subject.getStatus()));
        System.out.println("Hexadecimal: "+system.toHexadecimal(this.subject.getStatus()));
    }
}
