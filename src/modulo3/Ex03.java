package modulo3;

import java.util.Scanner;

public class Ex03 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String[] alimentos = { "Maça", "Banana", "Laranja" };
    String encontrarAl;
    int cont = 0;

    System.out.println("Digíte o alimento que deseja encontrar: ");
    encontrarAl = input.nextLine();

    while (cont < alimentos.length) {
      if (alimentos[cont].equals(encontrarAl)) {
        System.out.println(cont + " - " + alimentos[cont]);
      }
      cont++;
    }

    input.close();
  }
}
