package com.abrahim.strategydesignpattern.encrpt;

import com.abrahim.strategydesignpattern.enums.EncodingPatternEnum;
import org.springframework.stereotype.Service;

@Service
public class SHA2Impl implements Encryption{

  @Override
  public void encrypt(String toBeEncryption) {
    System.out.println("I am encrypted using SHA2 encryption Method");
  }

  @Override
  public EncodingPatternEnum getEncryptionType() {
    return EncodingPatternEnum.SHA2;
  }
}
