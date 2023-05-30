package modulo2;

import java.util.Scanner;

public class Ex03 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num;

    System.out.println("**** Dias da Semana ****");
    System.out.println("1 - Segunda");
    System.out.println("2 - Terça");
    System.out.println("3 - Quarta");
    System.out.println("4 - Quinta");
    System.out.println("5 - Sexta");
    System.out.println("6 - Sábado");
    System.out.println("7 - Domingo");

    num = input.nextInt();

    switch (num) {
      case 1:
        System.out.println("Segunda");
        break;
      case 2:
        System.out.println("Terça");
        break;
      case 3:
        System.out.println("Quarta");
        break;
      case 4:
        System.out.println("Quinta");
        break;
      case 5:
        System.out.println("Sexta");
        break;
      case 6:
        System.out.println("Sábado");
        break;
      case 7:
        System.out.println("Domingo");
        break;
      default:
        System.out.println("Digíte um número válido!");
        break;
    }

    input.close();
  }
}
