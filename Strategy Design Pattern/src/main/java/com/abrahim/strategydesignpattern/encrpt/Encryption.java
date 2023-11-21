package com.abrahim.strategydesignpattern.encrpt;

import com.abrahim.strategydesignpattern.enums.EncodingPatternEnum;

public interface Encryption {

  void encrypt(String toBeEncryption);

  EncodingPatternEnum getEncryptionType();
}
