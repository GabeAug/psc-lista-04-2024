/*Faça um programa que peça uma nota, entre zero e dez.
*Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido. */

import java.util.Scanner;

public class exercicio_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota entre 0 e 10: ");
        int nota = scanner.nextInt();

        while (nota > 10) {
            System.out.println("Valor invalido, digite novamente: ");
            nota = scanner.nextInt();
        }
        System.out.println("Sua nota é: " + nota);
        scanner.close();
    }

}