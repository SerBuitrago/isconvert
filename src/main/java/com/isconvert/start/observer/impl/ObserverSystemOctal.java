package com.isconvert.start.observer.impl;

import com.isconvert.factory.FactorySystemType;
import com.isconvert.start.observer.generic.ObserverSystemGeneric;
import com.isconvert.start.subject.SubjectSystem;

public class ObserverSystemOctal extends ObserverSystemGeneric<Long> {
    public ObserverSystemOctal(SubjectSystem<Long> subject) {
        super(subject, FactorySystemType.OCTAL);
    }
}
