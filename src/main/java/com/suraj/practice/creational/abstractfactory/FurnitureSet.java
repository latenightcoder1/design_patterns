package com.suraj.practice.creational.abstractfactory;

public class FurnitureSet {

  private Table table;

  private Chair chair;

  private Bed bed;

  public FurnitureSet(Table table, Chair chair, Bed bed) {
    this.table = table;
    this.chair = chair;
    this.bed = bed;
  }

  public Table getTable() {
    return table;
  }

  public Chair getChair() {
    return chair;
  }

  public Bed getBed() {
    return bed;
  }

  @Override
  public String toString() {
    return "FurnitureSet = " + this.bed.getTypeOfBed() + ", " + this.table.getTypeOfTable()
        + " and " + this.chair.getTypeOfChair();
  }
}
