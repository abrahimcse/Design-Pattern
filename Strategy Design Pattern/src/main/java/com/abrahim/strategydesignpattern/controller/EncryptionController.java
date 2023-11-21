package com.abrahim.strategydesignpattern.controller;

import com.abrahim.strategydesignpattern.enums.EncodingPatternEnum;
import com.abrahim.strategydesignpattern.factory.EncryptionFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class EncryptionController {

  private final EncryptionFactory factory;

  @GetMapping("/encrypt")
  public void encryptWithEncode(EncodingPatternEnum encodingPatternEnum) {
    factory.findEncryptionType(encodingPatternEnum).encrypt("Code decode");
  }

}
