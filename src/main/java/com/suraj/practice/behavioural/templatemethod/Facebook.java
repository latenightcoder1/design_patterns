package com.suraj.practice.behavioural.templatemethod;

public class Facebook extends SocialMedia {

  //constructor
  public Facebook(String userName, String password) {
    this.userName = userName;
    this.password = password;
  }

  /**
   * @param userName
   * @param password
   * @return
   */
  @Override
  boolean logIn(String userName, String password) {
    System.out.println("Logging in to Facebook");
    return true;
  }

  /**
   * @param message
   * @return
   */
  @Override
  boolean sendData(String message) {
    System.out.println("Sending data to Facebook");
    return true;
  }

  /**
   *
   */
  @Override
  void logOut() {
    System.out.println("Logging out from Facebook");
  }
}
