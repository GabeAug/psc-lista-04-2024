
/**
 * Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de crescimento de 3%
 * e que a população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%.
 * Faça um programa que calcule e escreva o número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B,
 * mantidas as taxas de crescimento.
 */

import java.util.Scanner;

public class exercicio_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int popA = 80000;
        int popB = 200000;
        int anos = 0;
        double crescimentoA = 3;
        double crescimentoB = 1.5;

        while (popA <= popB) {
            popA += (crescimentoA / 100) * popA;
            popB += (crescimentoB / 100) * popB;
            anos++;
        }
        System.out.println("População do país A: " + popA);
        System.out.println("População do país B: " + popB);
        System.out.println("A população do país A vai demorar " + anos + " anos para ultrapassar a população do país B");

        sc.close();

    }
}