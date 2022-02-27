package com.isconvert.observer.observer.impl;

import com.isconvert.factory.FactorySystemType;
import com.isconvert.observer.observer.generic.ObserverSystemGeneric;
import com.isconvert.observer.subject.SubjectSystem;

import static com.isconvert.util.SystemUtil.isDecimal;

public class ObserverSystemDecimal extends ObserverSystemGeneric<Long> {

    public ObserverSystemDecimal(SubjectSystem<Long> subject) {
        super(subject, FactorySystemType.DECIMAL);
    }

    @Override
    public boolean isValid() {
        return isDecimal(this.subject.getStatus());
    }
}
