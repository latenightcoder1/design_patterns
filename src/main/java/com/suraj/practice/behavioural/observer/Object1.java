package com.suraj.practice.behavioural.observer;

public class Object1 implements Observer {

  /**
   * @param key
   */
  @Override
  public void update(String key) {
    System.out.println("Object1: " + key);
  }
}
