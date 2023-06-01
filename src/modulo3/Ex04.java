package modulo3;

public class Ex04 {
  public static void main(String[] args) {
    int[] numeros = { 10, 20, 80, 40, 50 };
    int maior = Integer.MIN_VALUE;

    for (int i = 0; i < numeros.length; i++) {
      if (numeros[i] > maior) {
        maior = numeros[i];
      }
    }

    System.out.println("O maior número é " + maior);
  }
}
