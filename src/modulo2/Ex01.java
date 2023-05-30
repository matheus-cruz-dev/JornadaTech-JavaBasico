package modulo2;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, resultado;

        System.out.println("Digíte o primeiro número: ");
        n1 = input.nextInt();

        System.out.println("Digíte o segundo número: ");
        n2 = input.nextInt();

        resultado = n1 + n2;

        System.out.println("A soma de " + n1 + " e " + n2 + " é " + resultado);

        input.close();
    }
}