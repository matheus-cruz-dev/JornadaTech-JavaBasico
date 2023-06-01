package modulo3;

import java.util.Scanner;

public class Ex01 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String[] paises = new String[3];

    for (int i = 0; i < paises.length; i++) {
      System.out.println("Digíte o nome de um país: ");
      paises[i] = input.nextLine();
    }

    System.out.println("***** Paises ******");

    for (int i = 0; i < paises.length; i++) {
      System.out.println(paises[i]);
    }

    input.close();
  }
}
