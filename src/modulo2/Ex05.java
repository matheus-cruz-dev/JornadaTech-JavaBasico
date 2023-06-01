package modulo2;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, n3, menor = Integer.MAX_VALUE;

        System.out.println("Dígite o primeiro número(inteiro): ");
        n1 = input.nextInt();

        System.out.println("Dígite o segundo número(inteiro): ");
        n2 = input.nextInt();

        System.out.println("Dígite o terceiro número(inteiro): ");
        n3 = input.nextInt();

        if (n1 < menor) {
            menor = n1;
        }
        if (n2 < menor) {
            menor = n2;
        }
        if (n3 < menor) {
            menor = n3;
        }

        System.out.println("O número menor é " + menor);

        input.close();
    }
}
