package com.isconvert.observer.observer.impl;

import com.isconvert.factory.FactorySystemType;
import com.isconvert.observer.observer.generic.ObserverSystemGeneric;
import com.isconvert.observer.subject.SubjectSystem;

import static com.isconvert.util.SystemUtil.isHexadecimal;

public class ObserverSystemHexadecimal extends ObserverSystemGeneric<String> {

    public ObserverSystemHexadecimal(SubjectSystem<String> subject) {
        super(subject, FactorySystemType.HEXADECIMAL);
    }

    @Override
    public boolean isValid() {
        return isHexadecimal(this.subject.getStatus());
    }
}
