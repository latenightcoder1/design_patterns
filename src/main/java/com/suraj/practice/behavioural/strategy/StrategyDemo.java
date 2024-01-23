package com.suraj.practice.behavioural.strategy;

public class StrategyDemo {

  public static void main(String[] args) {
    PaymentProcessor debitCardPayment = new PaymentProcessor(new DebitCardPaymentStrategy());
    debitCardPayment.processPayment(123d);
    System.out.println("-------------");
    PaymentProcessor creditCardPayment = new PaymentProcessor(new CreditCardPaymentStrategy());
    creditCardPayment.processPayment(456d);
    System.out.println("-------------");
    PaymentProcessor paypalPayment = new PaymentProcessor(new PaypalPaymentStrategy());
    paypalPayment.processPayment(987d);
  }

}
