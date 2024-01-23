package com.suraj.practice.behavioural.strategy;

public class PaypalPaymentStrategy implements PaymentStrategy {

  /**
   * @param amount {@link double}
   */
  @Override
  public void processPayment(double amount) {
    System.out.println("Paypal payment strategy");
  }
}
