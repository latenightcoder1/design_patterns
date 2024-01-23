package com.suraj.practice.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject1 implements Subject {

  private String key;
  private List<Observer> observers = new ArrayList<>();

  /**
   * @param o
   */
  @Override
  public void registerObserver(Observer o) {
    observers.add(o);
  }

  /**
   * @param o
   */
  @Override
  public void removeObserver(Observer o) {
    observers.remove(o);
  }

  @Override
  public void changeSubject(String key) {
    this.key = key;
    notifyObservers();
  }

  /**
   *
   */
  @Override
  public void notifyObservers() {
    for (Observer o : observers) {
      o.update(key);
    }
  }
}
