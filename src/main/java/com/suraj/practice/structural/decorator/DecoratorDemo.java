package com.suraj.practice.structural.decorator;

/**
 * Decorator design pattern is helpful in providing runtime modification abilities and hence more
 * flexible.
 * <p>
 * It's easy to maintain and extend when the number of choices are more.
 * <p>
 * The disadvantage of decorator design pattern is that it uses a lot of similar kind of objects
 * (decorators).
 * <p>
 * Decorator pattern is used a lot in Java IO classes, such as FileReader, BufferedReader etc.
 */
public class DecoratorDemo {

  public static void main(String[] args) {
    Car sportsCar = new SportsCar(new BasicCar());
    sportsCar.assemble();
    System.out.println();
    Car luxurySportCar = new LuxuryCar(new SportsCar(new BasicCar()));
    luxurySportCar.assemble();
  }

}
