package com.company.service;

import java.util.ArrayList;

public class DecryptionService {

  private String cipherText;
  private ArrayList<Character> alphabet = new ArrayList<>();
  private int charIndex = 1072;

  public DecryptionService(String cipherText) {
    setAlphabet();
    this.cipherText = cipherText.toLowerCase();
  }

  //Returns the offset symbol c on key in right.
  private char chooseChar(char c, int key) {
    if (c >= 'а' && c <= 'е') {
      return alphabet.get(((c - 1072) + key) % 33);
    } else if (c == 'ё') {
      return alphabet.get((6 + key) % 33);
    } else if (c >= 'ж' && c <= 'я') {
      return alphabet.get(((c - 1071) + key) % 33);
    } else {
      return c;
    }
  }

  //Print decrypted text
  public void printDecrypted(int key) {
    for (char c : cipherText.toCharArray()) {
      System.out.print(chooseChar(c, key));
    }
    System.out.println();
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
