package com.suraj.practice.structural.decorator;

public class LuxuryCar extends CarDecorator {

  public LuxuryCar(Car car) {
    super(car);
  }

  @Override
  public void assemble() {
    super.assemble();
    System.out.print("Adding Luxury Features.");
  }

}
