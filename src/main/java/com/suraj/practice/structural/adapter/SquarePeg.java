package com.suraj.practice.structural.adapter;

public class SquarePeg {

  private double width;

  public SquarePeg(double width) {
    this.width = width;
  }

  public double getWidth() {
    return width;
  }

  @Override
  public String toString() {
    return "SquarePeg{" +
        "width=" + width +
        '}';
  }
}
