package com.suraj.practice.behavioural.observer;

public class Object2 implements Observer {

  /**
   * @param key
   */
  @Override
  public void update(String key) {
    System.out.println("Object2: " + key);
  }
}
