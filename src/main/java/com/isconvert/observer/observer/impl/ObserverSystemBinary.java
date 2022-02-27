package com.isconvert.observer.observer.impl;

import com.isconvert.factory.FactorySystemType;
import com.isconvert.observer.observer.generic.ObserverSystemGeneric;
import com.isconvert.observer.subject.SubjectSystem;

import static com.isconvert.util.SystemUtil.isBinary;

public class ObserverSystemBinary extends ObserverSystemGeneric<String> {
    public ObserverSystemBinary(SubjectSystem subject) {
        super(subject, FactorySystemType.BINARY);
    }

    @Override
    public boolean isValid() {
        return isBinary(this.subject.getStatus());
    }
}
