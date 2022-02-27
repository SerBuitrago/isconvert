package com.isconvert.observer.subject;

import com.isconvert.observer.observer.ObserverSystem;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@ToString
public class SubjectSystem<T> {

    private List<ObserverSystem<T>> observers = new ArrayList<>();
    private T status;

    public void setStatus(T status){
        this.status = status;
        notification();
    }

    public void add(ObserverSystem<T> observer){
        observers.add(observer);
    }

    public void notification(){
        observers.forEach(observer -> observer.update());
    }
}