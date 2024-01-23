package com.suraj.practice.creational.factory;

/**
 * Factory class to resolve different shapes based on requirement.
 */
public class ShapeFactory {

  /**
   * This method resolves actual shape based on shapeType.
   *
   * @param shapeType {@link String}
   * @return resolved shape.
   */
  public Shape getShape(String shapeType) {
    if ("Circle".equals(shapeType)) {
      return new Circle();
    } else if ("Rectangle".equals(shapeType)) {
      return new Rectangle();
    } else if ("Square".equals(shapeType)) {
      return new Square();
    } else {
      return null;
    }
  }
}
