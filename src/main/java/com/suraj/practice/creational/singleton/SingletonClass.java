package com.suraj.practice.creational.singleton;

public class SingletonClass {

  private SingletonClass() {
    System.out.println("SingletonClass Constructor");
  }

  public static SingletonClass getInstance() {
    return SingletonClassHelper.instance;
  }

  private static class SingletonClassHelper {

    private static final SingletonClass instance = new SingletonClass();
  }
}
