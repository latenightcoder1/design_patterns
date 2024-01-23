package com.suraj.practice.creational.builder;


public class Student {

  private final String name;
  private final String address;
  private final String id;
  private final int age;

  private Student(StudentBuilder studentBuilder) {
    this.name = studentBuilder.name;
    this.address = studentBuilder.address;
    this.id = studentBuilder.id;
    this.age = studentBuilder.age;
  }

  public String getName() {
    return name;
  }

  public String getAddress() {
    return address;
  }

  public String getId() {
    return id;
  }

  public int getAge() {
    return age;
  }

  //to string method
  @Override
  public String toString() {
    return "Student [name=" + name + ", address=" + address + ", id=" + id + ", age=" + age + "]";
  }

  protected static class StudentBuilder {

    private String name;
    private String address;
    private String id;
    private int age;

    public StudentBuilder name(String name) {
      this.name = name;
      return this;
    }

    public StudentBuilder address(String address) {
      this.address = address;
      return this;
    }

    public StudentBuilder id(String id) {
      this.id = id;
      return this;
    }

    public StudentBuilder age(int age) {
      this.age = age;
      return this;
    }

    public Student build() {
      return new Student(this);
    }
  }

}
