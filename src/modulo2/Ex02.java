package modulo2;

import java.util.Scanner;

public class Ex02 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num;

    System.out.println("Digíte um número inteiro: ");
    num = input.nextInt();

    if (num % 2 == 0) {
      System.out.println("É par!");
    } else {
      System.out.println("É impar!");
    }

    input.close();
  }
}
