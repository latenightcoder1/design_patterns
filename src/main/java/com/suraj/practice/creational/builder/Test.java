package com.suraj.practice.creational.builder;

import com.suraj.practice.creational.builder.Student.StudentBuilder;

public class Test {

  public static void main(String[] args) {
    Student student = new StudentBuilder().name("Suraj").address("Bangalore").age(20).build();
    System.out.println(student);
  }

}
