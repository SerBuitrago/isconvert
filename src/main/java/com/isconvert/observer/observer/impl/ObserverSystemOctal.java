package com.isconvert.observer.observer.impl;

import com.isconvert.factory.FactorySystemType;
import com.isconvert.observer.observer.generic.ObserverSystemGeneric;
import com.isconvert.observer.subject.SubjectSystem;

import static com.isconvert.util.SystemUtil.isOctal;

public class ObserverSystemOctal extends ObserverSystemGeneric<Long> {
    public ObserverSystemOctal(SubjectSystem<Long> subject) {
        super(subject, FactorySystemType.OCTAL);
    }

    @Override
    public boolean isValid() {
        return isOctal(this.subject.getStatus());
    }
}
