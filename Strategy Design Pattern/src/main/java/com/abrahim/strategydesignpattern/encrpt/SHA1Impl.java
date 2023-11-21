package com.abrahim.strategydesignpattern.encrpt;

import com.abrahim.strategydesignpattern.enums.EncodingPatternEnum;

public class SHA1Impl implements Encryption{

  @Override
  public void encrypt(String toBeEncryption) {
    System.out.println("I am encrypted using SHA1 encryption Method");
  }

  @Override
  public EncodingPatternEnum getEncryptionType() {
    return EncodingPatternEnum.SHA1;
  }
}
