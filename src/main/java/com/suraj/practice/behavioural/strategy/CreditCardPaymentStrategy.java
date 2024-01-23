package com.suraj.practice.behavioural.strategy;

public class CreditCardPaymentStrategy implements PaymentStrategy {

  /**
   * @param amount {@link Double}
   */
  @Override
  public void processPayment(double amount) {
    System.out.println("Credit card payment strategy");
  }
}
