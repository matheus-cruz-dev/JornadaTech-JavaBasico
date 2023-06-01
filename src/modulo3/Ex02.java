package modulo3;

import java.util.Scanner;

public class Ex02 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int tamanho;

    System.out.println("Digite o tamanho da sua lista de compras: ");
    tamanho = input.nextInt();

    input.nextLine();

    String[] listaDeCompras = new String[tamanho];

    for (int i = 0; i < listaDeCompras.length; i++) {
      System.out.println("Digíte o item a adicinar: ");
      listaDeCompras[i] = input.nextLine();
    }

    System.out.println("***** Lista de compras *****");

    for (int i = 0; i < listaDeCompras.length; i++) {
      System.out.println(listaDeCompras[i]);
    }

    input.close();
  }
}
