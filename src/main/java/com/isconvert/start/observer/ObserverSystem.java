package com.isconvert.start.observer;

import com.isconvert.factory.FactorySystemType;
import com.isconvert.start.subject.SubjectSystem;

public abstract class ObserverSystem<T> {

    protected SubjectSystem<T> subject;
    protected FactorySystemType systemType;

    public abstract void  update();
}
