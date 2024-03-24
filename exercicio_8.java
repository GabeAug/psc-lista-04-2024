import java.util.Scanner;

/**
 * Faça um programa que leia 5 números e informe a soma e a média dos números.
 */

import java.util.Scanner;

public class exercicio_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2, num3, num4, num5, soma, media;

        System.out.println("Digite 5 números: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        num4 = sc.nextInt();
        num5 = sc.nextInt();

        soma = num1 + num2 + num3 + num4 + num5;
        media = soma / 5;

        System.out.println("Soma dos números informado é: " + soma);
        System.out.println("Média dos números inromado é: " + media);

        sc.close();

    }
}