package com.company.service;

import java.util.ArrayList;

public class EncryptionService {

  private String cipherText;
  private ArrayList<Character> alphabet = new ArrayList<>();
  private int charIndex = 1072;

  public EncryptionService(String normalText) {
    setAlphabet();
    this.cipherText = normalText.toLowerCase();
  }

  public String encrypt(int offset) {
    StringBuilder output = new StringBuilder();
    for (int i = 0; i < cipherText.length(); ++i) {
      int index = alphabet.indexOf(cipherText.charAt(i));
      if (index < 0) {
        output.append(cipherText.charAt(i));
      } else {
        output.append(alphabet.get((index + offset) % 33));
      }
    }
    return output.toString();
  }

  //Fills the alphabet with characters
  private void setAlphabet() {
    for (int i = 0; i < 33; i++) {
      if (i != 6) {
        alphabet.add((char) (charIndex + i));
      } else {
        alphabet.add('ё');
        charIndex--;
      }
    }
  }
}
