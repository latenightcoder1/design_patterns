package com.suraj.practice.behavioural.observer;

public interface Subject {

  public void registerObserver(Observer o);

  public void removeObserver(Observer o);

  void changeSubject(String key);

  public void notifyObservers();

}
