package com.isconvert.observer.observer;

import com.isconvert.factory.FactorySystemType;
import com.isconvert.observer.subject.SubjectSystem;

public abstract class ObserverSystem<T> {

    protected SubjectSystem<T> subject;
    protected FactorySystemType systemType;

    public abstract void  update();
}
