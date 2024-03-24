
/**
 * Faça um programa que leia 5 números e informe o maior número.
 */

import java.util.Scanner;

public class exercicio_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2, num3, num4, num5, numeroMaior;

        System.out.println("Digite 5 números: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        num4 = sc.nextInt();
        num5 = sc.nextInt();

        numeroMaior = Math.max(num1, Math.max(num2, Math.max(num3, Math.max(num4, num5))));

        System.out.println("O maior número é: " + numeroMaior);

        sc.close();
    }
}