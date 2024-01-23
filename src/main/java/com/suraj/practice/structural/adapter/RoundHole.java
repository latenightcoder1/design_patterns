package com.suraj.practice.structural.adapter;

public class RoundHole {

  private double radius;

  public RoundHole(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public boolean fits(RoundPeg roundPeg) {
    return (roundPeg.getRadius() <= radius);
  }

  @Override
  public String toString() {
    return "RoundHole{" +
        "radius=" + radius +
        '}';
  }
}
