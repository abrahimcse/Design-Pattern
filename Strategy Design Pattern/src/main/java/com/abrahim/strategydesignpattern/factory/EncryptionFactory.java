package com.abrahim.strategydesignpattern.factory;

import com.abrahim.strategydesignpattern.encrpt.Encryption;
import com.abrahim.strategydesignpattern.enums.EncodingPatternEnum;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EncryptionFactory {

  Map<EncodingPatternEnum, Encryption> map;

  @Autowired
  public EncryptionFactory(Set<Encryption> encryptionSet){
    createStrategy(encryptionSet);
  }

  private void createStrategy(Set<Encryption> encryptionSet) {
    map=new HashMap<EncodingPatternEnum, Encryption>();
    encryptionSet.stream().forEach(e-> map.put(e.getEncryptionType(),e));
  }

  public Encryption findEncryptionType(EncodingPatternEnum encodingPatternEnum){
    return map.get(encodingPatternEnum);
  }
}
