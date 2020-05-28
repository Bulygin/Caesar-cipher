package com.company.service;

import java.util.ArrayList;

public abstract class ACryptorService {

  private String cipherText;
  private ArrayList<Character> alphabet = new ArrayList<>();
  private int charIndex = 1072;

  protected ACryptorService(String cipherText) {
    setAlphabet();
    this.cipherText = cipherText.toLowerCase();
  }

  //Fills the alphabet with characters
  void setAlphabet() {
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
