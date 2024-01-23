package com.suraj.practice.structural.proxy;

/**
 * This is a good choice in the following cases:
 * <p>
 * When we want to have a simplified version of an object or access the object more securely When we
 * want a local version of a remote object
 */
public class ProxyDemo {

  public static void main(String[] args) {
    ExpensiveObject expensiveObject = new ExpensiveObjectProxy();
    expensiveObject.process();
    expensiveObject.process();
  }

}
