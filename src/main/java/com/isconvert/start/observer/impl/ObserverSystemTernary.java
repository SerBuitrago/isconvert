package com.isconvert.start.observer.impl;

import com.isconvert.factory.FactorySystemType;
import com.isconvert.start.observer.generic.ObserverSystemGeneric;
import com.isconvert.start.subject.SubjectSystem;

public class ObserverSystemTernary extends ObserverSystemGeneric<Long> {
    public ObserverSystemTernary(SubjectSystem<Long> subject) {
        super(subject, FactorySystemType.TERNARY);
    }
}
