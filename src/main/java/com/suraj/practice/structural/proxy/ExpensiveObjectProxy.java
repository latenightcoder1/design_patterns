package com.suraj.practice.structural.proxy;

public class ExpensiveObjectProxy implements ExpensiveObject {

  private static ExpensiveObjectImpl expensiveObject;

  public ExpensiveObjectProxy() {
  }

  /**
   *
   */
  @Override
  public void process() {
    if (expensiveObject == null) {
      expensiveObject = new ExpensiveObjectImpl();
    }
    expensiveObject.process();
  }
}
