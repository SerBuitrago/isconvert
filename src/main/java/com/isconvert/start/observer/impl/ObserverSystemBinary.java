package com.isconvert.start.observer.impl;

import com.isconvert.factory.FactorySystemType;
import com.isconvert.start.observer.generic.ObserverSystemGeneric;
import com.isconvert.start.subject.SubjectSystem;

public class ObserverSystemBinary extends ObserverSystemGeneric<String> {
    public ObserverSystemBinary(SubjectSystem subject) {
        super(subject, FactorySystemType.BINARY);
    }
}
