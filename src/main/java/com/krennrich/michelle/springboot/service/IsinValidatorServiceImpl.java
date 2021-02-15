package com.krennrich.michelle.springboot.service;

import com.krennrich.michelle.springboot.model.ValidationResponse;
import org.springframework.stereotype.Service;

@Service
public class IsinValidatorServiceImpl implements IsinValidatorService{

  @Override
  public ValidationResponse validateISIN(String isin) {
    ValidationResponse response = new ValidationResponse();
    response.setIsin(isin);

    if (isin.length() != 12) {
      response.setValid(false);
    } else {
      response.setValid(true);
    }

    return response;
  }
}
