package com.suraj.practice.creational.factory;public class Test {  public static void main(String[] args) {    new ShapeFactory().getShape("Circle").draw();    new ShapeFactory().getShape("Rectangle").draw();    new ShapeFactory().getShape("Square").draw();  }}