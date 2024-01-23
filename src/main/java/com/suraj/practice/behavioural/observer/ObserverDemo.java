package com.suraj.practice.behavioural.observer;

public class ObserverDemo {

  public static void main(String[] args) throws InterruptedException {
    Subject subject = new Subject1();
    Observer observer1 = new Object1();
    Observer observer2 = new Object2();
    subject.registerObserver(observer1);
    subject.registerObserver(observer2);

    subject.changeSubject("subject changed to 1");
    Thread.sleep(1000 * 10);
    subject.removeObserver(observer1);
    subject.changeSubject("subject changed to 2");
  }

}
