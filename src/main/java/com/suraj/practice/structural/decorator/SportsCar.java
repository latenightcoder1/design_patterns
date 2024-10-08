package com.suraj.practice.structural.decorator;

public class SportsCar extends CarDecorator {

  public SportsCar(Car car) {
    super(car);
  }

  @Override
  public void assemble() {
    super.assemble();
    System.out.print("Adding Sports Features.");
  }

}
