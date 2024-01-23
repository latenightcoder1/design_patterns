package com.suraj.practice.behavioural.templatemethod;

public class Twitter extends SocialMedia {

  //constructor
  public Twitter(String userName, String password) {
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
    System.out.println("Logging in to Twitter");
    return true;
  }

  /**
   * @param message
   * @return
   */
  @Override
  boolean sendData(String message) {
    System.out.println("Sending data to Twitter");
    return true;
  }

  /**
   *
   */
  @Override
  void logOut() {
    System.out.println("Logging out from Twitter");
  }
}
