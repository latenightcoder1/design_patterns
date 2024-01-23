package com.suraj.practice.creational.prototype;

import java.util.Objects;

public class Circle extends Shape {

  public int radius;

  public Circle() {
  }

  public Circle(int x, int y, String color, int radius) {
    super(x, y, color);
    this.radius = radius;
  }

  @Override
  public Shape clone() {
    return new Circle(x, y, color, radius);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    Circle circle = (Circle) o;
    return radius == circle.radius;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), radius);
  }
}
