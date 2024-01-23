package com.suraj.practice.behavioural.templatemethod;

public abstract class SocialMedia {

  protected String userName;
  protected String password;

  public boolean post(final String message) {
    //authenticate
    if (logIn(this.userName, this.password)) {
      System.out.println("Authenticated");
      //send data
      boolean result = sendData(message);
      System.out.println("Message sent");
      //log out
      logOut();
      System.out.println("Logged out");
      System.out.println("posted");
      return result;
    }
    return false;
  }

  abstract boolean logIn(String userName, String password);

  abstract boolean sendData(String message);

  abstract void logOut();
}
