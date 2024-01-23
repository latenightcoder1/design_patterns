package com.suraj.practice.behavioural.strategy;

public class DebitCardPaymentStrategy implements PaymentStrategy {

  /**
   * @param amount {@link double}
   */
  @Override
  public void processPayment(double amount) {
    System.out.println("Debit card payment strategy");
  }
}
