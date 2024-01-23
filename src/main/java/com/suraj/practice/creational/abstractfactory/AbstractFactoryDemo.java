package com.suraj.practice.creational.abstractfactory;

/**
 * Creating a furniture set combination of bed, table and chair.
 */
public class AbstractFactoryDemo {

  public static void main(String[] args) {
    FurnitureSet furnitureSet1 = new FurnitureSet(new RoundTable(), new ReclinerChair(),
        new KingSize());
    System.out.println(furnitureSet1);

    FurnitureSet furnitureSet2 = new FurnitureSet(new SquareTable(), new ReclinerChair(),
        new KingSize());
    System.out.println(furnitureSet2);

    FurnitureSet furnitureSet3 = new FurnitureSet(new SquareTable(), new ReclinerChair(),
        new QueenSize());
    System.out.println(furnitureSet3);
  }

}
