package com.abrahim.strategydesignpattern.encrpt;

import com.abrahim.strategydesignpattern.enums.EncodingPatternEnum;

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
