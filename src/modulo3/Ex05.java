package modulo3;

// Escreva um programa Java que declare uma matriz 3x3 de doubles e preencha-a com os valores 1.0, 2.5 e 3.7 (para todas as linhas). Em seguida, use dois loops 'for' aninhados para imprimir cada elemento da matriz e a soma dos valores da coluna.

public class Ex05 {
  public static void main(String[] args) {
    double[][] matriz = { { 1.0, 1.0, 1.0 }, { 2.5, 2.5, 2.5 }, { 3.7, 3.7, 3.7 } };

    // contando as linhas
    for (int linha = 0; linha < 3; linha++) {
      double soma = 0;
      // contando as colunas
      for (int coluna = 0; coluna < 3; coluna++) {
        System.out.println(matriz[coluna][linha]);
        soma += matriz[coluna][linha];
      }
      System.out.println("Soma da coluna: " + soma);
    }

  }
}
