package com.bezkoder.spring.security.jwt.models;

import javax.validation.constraints.NotBlank;

public class EncryptData {
	@NotBlank
	  private String encryptData;

	  public String getEncryptData() {
	    return encryptData;
	  }

	  public void setEncryptData(String encryptData) {
	    this.encryptData = encryptData;
	  }
}
