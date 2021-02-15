package com.krennrich.michelle.springboot.service;

import com.krennrich.michelle.springboot.model.ValidationResponse;

public interface IsinValidatorService {

  ValidationResponse validateISIN(String isin);

}
