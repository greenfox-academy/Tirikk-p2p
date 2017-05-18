package com.greenfox.chat.model;

public class ErrorResponse {
  String status = "error";
  String message;

  public ErrorResponse(String message) {
    this.message = message;
  }

  public String getStatus() {
    return status;
  }

  public String getMessage() {
    return message;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
