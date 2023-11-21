package com.abrahim.strategydesignpattern.encrpt;

import com.abrahim.strategydesignpattern.enums.EncodingPatternEnum;
import org.springframework.stereotype.Service;

@Service
public class MD5Impl implements Encryption{

  @Override
  public void encrypt(String toBeEncryption) {
    System.out.printf("I am encrypted using MD5 encryption Method");
  }

  @Override
  public EncodingPatternEnum getEncryptionType() {
    return EncodingPatternEnum.MD5;
  }
}
