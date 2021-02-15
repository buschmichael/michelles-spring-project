package com.krennrich.michelle.springboot.model;

public class ValidationResponse {

  private boolean valid;
  private String isin;

  public void setIsin(String isin) {
    this.isin = isin;
  }

  public void setValid(boolean valid) {
    this.valid = valid;
  }

  public String getIsin() {
    return isin;
  }

  public boolean isValid() {
    return valid;
  }
}
