package com.suraj.practice.behavioural.templatemethod;

/**
 * Eg- All non-abstract methods of AbstractList, AbstractSet and AbstractMap.
 * <p>
 * All non-abstract methods of InputStream, OutputStream, Reader and Writer.
 * <p>
 * Extracting all common implementation to parent abstract class. code reuse.
 * <p>
 * Template Method Pattern is used to implement the Template Method design pattern, which is a
 * behavioral design pattern that defines the skeleton of an algorithm in an operation, deferring
 * some steps to subclasses. Template Method lets subclasses redefine certain steps of an algorithm
 * without changing the algorithm's structure.
 * <p>
 */
public class TemplateMethodDemo {

  public static void main(String[] args) {
    SocialMedia facebook = new Facebook("abc", "abc");
    facebook.post("Hello Facebook");
    System.out.println("----------------------------------------------------");
    SocialMedia twitter = new Twitter("abc", "abc");
    twitter.post("Hello Twitter");
  }

}
