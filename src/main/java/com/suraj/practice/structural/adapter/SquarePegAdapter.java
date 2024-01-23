package com.suraj.practice.structural.adapter;

public class SquarePegAdapter extends RoundPeg {

  private SquarePeg squarePeg;

  public SquarePegAdapter(SquarePeg squarePeg) {
    this.squarePeg = squarePeg;
  }

  @Override
  public double getRadius() {
    return 1.414 * squarePeg.getWidth() / 2;
  }

  @Override
  public String toString() {
    return "SquarePegAdapter{" +
        "squarePeg=" + squarePeg +
        '}';
  }
}
