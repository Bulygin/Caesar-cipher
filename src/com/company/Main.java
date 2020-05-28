package com.company;

import com.company.service.DecryptionService;
import com.company.service.EncryptionService;

public class Main {

  private static final String CIPHER_TEXT = "Еъёчхф Вхзёюлх, адздёиу ф ждэщхб, црбх еёдюэчъщъгюъв южаижжзчх, ждчъёнъгжзчдв.";

  private static final String NORMAL_TEXT = "Этот текст будет зашифрован";

  public static void main(String[] args) {

    //Пример шифрования текста, метод encrypt принимает число смещений.
    EncryptionService encryptionService = new EncryptionService(NORMAL_TEXT);
    System.out.println("Зашифрованый текст: " + encryptionService.encrypt(2));

    System.out.println(
        "\n<-------------------------------------------------------------------------------->\n");
    //Пример расшифровки текста, метод выводит в консоль все варианты смещения текста.
    DecryptionService decryptionService = new DecryptionService(CIPHER_TEXT);
    for (int i = 0; i <= 32; i++) {
      System.out.printf("%d:\t", i);
      decryptionService.printDecrypted(i);
    }
  }
}
