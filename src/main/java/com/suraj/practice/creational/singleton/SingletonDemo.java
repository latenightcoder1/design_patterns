package com.suraj.practice.creational.singleton;

public class SingletonDemo {

  public static void main(String[] args) {
    SingletonClass singleton1 = SingletonClass.getInstance();
    SingletonClass singleton2 = SingletonClass.getInstance();
    if (singleton1 == singleton2) {
      System.out.println("Singleton Pattern is working fine");
    }

  }

}
