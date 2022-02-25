package com.isconvert.start.observer.impl;

import com.isconvert.factory.FactorySystemType;
import com.isconvert.start.observer.generic.ObserverSystemGeneric;
import com.isconvert.start.subject.SubjectSystem;

public class ObserverSystemDecimal extends ObserverSystemGeneric<Long> {

    public ObserverSystemDecimal(SubjectSystem<Long> subject) {
        super(subject, FactorySystemType.DECIMAL);
    }
}
