package modulo2;

import java.util.Scanner;

public class Ex04 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int idade;
    String nome, cidade, estado;

    System.out.println("Digíte o seu nome: ");
    nome = input.nextLine();

    System.out.println("Digíte a sua idade: ");
    idade = input.nextInt();

<<<<<<< HEAD
    input.nextLine();
=======
    input.nextLine(); // evitar comportamento inesperado de quebra de linha pelo println e nextInt
>>>>>>> 37a946160f0a25692047fc9a97054828511ae8bb

    System.out.println("Digíte a sua cidade: ");
    cidade = input.nextLine();

    System.out.println("Digíte o seu estado: ");
    estado = input.nextLine();

    System.out.println("Olá, seu nome é " + nome + ", você têm " + idade + " anos, é da cidade de " + cidade
        + ", situada no estado de " + estado + ".");

    input.close();
  }
}
