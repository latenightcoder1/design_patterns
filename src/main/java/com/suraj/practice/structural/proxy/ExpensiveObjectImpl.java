package com.suraj.practice.structural.proxy;

public class ExpensiveObjectImpl implements ExpensiveObject {

  public ExpensiveObjectImpl() {
    loadHeavyConfiguration();
  }

  private void loadHeavyConfiguration() {
    System.out.println("Loading heavy configuration");
  }

  /**
   *
   */
  @Override
  public void process() {
    System.out.println("Expensive object impl processing");
  }
}
