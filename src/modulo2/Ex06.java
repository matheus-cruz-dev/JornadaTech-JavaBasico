package modulo2;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.println("**** Horas ****");
        System.out.println("Dígite que horas são: ");
        num = input.nextInt();

        if (num >= 0 && num <= 6) {
            System.out.println("Boa madrugada");
        }

        if (num >= 7 && num <= 11) {
            System.out.println("Bom dia");
        }

        if (num >= 12 && num <= 18) {
            System.out.println("Boa tarde");
        }

        if (num >= 19 && num <= 23) {
            System.out.println("Boa noite");
        }

        input.close();
    }
}
