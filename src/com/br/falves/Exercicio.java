/**
 * @author falvesmac
 */

package com.br.falves;

import java.util.Scanner;

public class Exercicio {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int numero = leitor.nextInt();

    Integer numero2 = Integer.valueOf(numero);
    System.out.println(numero);
    System.out.println(numero2);
  }
}