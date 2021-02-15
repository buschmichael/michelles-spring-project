package com.krennrich.michelle.springboot.controller;

import com.krennrich.michelle.springboot.model.ValidationResponse;
import com.krennrich.michelle.springboot.service.IsinValidatorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MichellesHalloController {

  private final IsinValidatorService isinValidatorService;

  public MichellesHalloController(IsinValidatorService isinValidatorService) {
    this.isinValidatorService = isinValidatorService;
  }

  @GetMapping("/michelle-sagt-hallo")
  public String getMichelleToSayHallo() {
    return "Hallo!";
  }

  @GetMapping("/isin-validator/{isin}")
  public ResponseEntity<ValidationResponse> validateIsin(@PathVariable("isin") String isin) {
    return new ResponseEntity<>(this.isinValidatorService.validateISIN(isin), HttpStatus.OK);
  }

}
