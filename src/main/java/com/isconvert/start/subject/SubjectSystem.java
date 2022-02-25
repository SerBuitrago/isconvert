package com.isconvert.start.subject;

import com.isconvert.start.observer.ObserverSystem;
import lombok.Getter;
import lombok.ToString;
import reactor.core.publisher.Flux;

@Getter
@ToString
public class SubjectSystem<T> {

    private Flux<ObserverSystem<T>> observers = Flux.empty();
    private T status;

    public void setStatus(T status){
        this.status = status;
        notification();
    }

    public void add(ObserverSystem<T> observer){
        observers = Flux.merge(observers, Flux.just(observer));
        observers.subscribe();
    }

    public void notification(){
        observers.doOnNext(observer -> observer.update())
                 .subscribe();
    }
}