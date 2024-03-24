
/**
 * Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo compreendido por eles.
 */

import java.util.Scanner;

public class exercicio_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Digite o primeiro número inteiro: ");
        num1 = sc.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        num2 = sc.nextInt();

        int maior = Math.max(num1, num2);
        int menor = Math.min(num1, num2);

        System.out.println("Os números no intervalo entre " + menor + " e " + maior + ":");
        for (int i = menor + 1; i < maior; i++) {
            System.out.println(i);
        }

        sc.close();
    }
}