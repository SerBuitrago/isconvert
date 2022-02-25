package com.isconvert.start.observer.impl;

import com.isconvert.factory.FactorySystemType;
import com.isconvert.start.observer.generic.ObserverSystemGeneric;
import com.isconvert.start.subject.SubjectSystem;

public class ObserverSystemHexadecimal extends ObserverSystemGeneric<String> {

    public ObserverSystemHexadecimal(SubjectSystem<String> subject) {
        super(subject, FactorySystemType.HEXADECIMAL);
    }
}
