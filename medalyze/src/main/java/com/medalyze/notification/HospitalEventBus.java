package com.medalyze.notification;

import java.util.ArrayList;
import java.util.List;

public class HospitalEventBus {

    private static HospitalEventBus instance;
    private List<HospitalObserver> observers = new ArrayList<>();

    private HospitalEventBus() {}

    public static HospitalEventBus getInstance() {
        if (instance == null) {
            instance = new HospitalEventBus();
        }
        return instance;
    }

    public void subscribe(HospitalObserver observer) {
        observers.add(observer);
    }

    public void unsubscribe(HospitalObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String event) {
        for (HospitalObserver observer : observers) {
            observer.update(event);
        }
    }
}
