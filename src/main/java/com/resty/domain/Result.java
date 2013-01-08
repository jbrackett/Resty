package com.resty.domain;

public class Result {

  private String message;

  public Result() {
    this("");
  }

  public Result(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

}
