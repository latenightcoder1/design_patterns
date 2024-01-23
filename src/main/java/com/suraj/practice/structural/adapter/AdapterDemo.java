package com.suraj.practice.structural.adapter;

/**
 * Structural design pattern which allows incompatible objects to collaborate.it is very often used
 * in system based on legacy code
 * <p>
 * Wrappers like entity to DTO can be considered as adapter.
 * <p>
 * Xml, jso to java model mapper, marshaller etc.
 */
public class AdapterDemo {

  public static void main(String[] args) {
    RoundHole hole = new RoundHole(5);
    RoundPeg roundPeg1 = new RoundPeg(3);
    System.out.println("Does peg " + roundPeg1 + " fit hole " + hole + " ?" + hole.fits(roundPeg1));
    RoundPeg roundPeg2 = new RoundPeg(6);
    System.out.println("Does peg " + roundPeg2 + " fit hole " + hole + " ?" + hole.fits(roundPeg2));
    System.out.println(".......");
    SquarePegAdapter squarePegAdapter1 = new SquarePegAdapter(new SquarePeg(2));
    System.out.println("Does peg " + squarePegAdapter1 + " fit hole " + hole + " ?" + hole.fits(
        squarePegAdapter1));
    SquarePegAdapter squarePegAdapter2 = new SquarePegAdapter(new SquarePeg(20));
    System.out.println("Does peg " + squarePegAdapter2 + " fit hole " + hole + " ?" + hole.fits(
        squarePegAdapter2));
  }

}
