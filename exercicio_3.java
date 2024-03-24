
/**
*Faça um programa que leia e valide as seguintes informações:
*Nome: maior que 3 caracteres;
*Idade: entre 0 e 150;
*Salário: maior que zero;
*Sexo: 'f' ou 'm';
*Estado Civil: 's', 'c', 'v', 'd';
 */

import java.util.Scanner;

public class exercicio_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;
        double salario;
        char sexo, estadoCivil;

        do {
            System.out.println("Digite seu nome: ");
            nome = sc.nextLine();
        } while (nome.length() <= 3);

        do {
            System.out.println("Digite sua idade: ");
            idade = sc.nextInt();
        } while (idade < 0 || idade > 150);

        do {
            System.out.println("Digite seu salario: ");
            salario = sc.nextDouble();
        } while (salario <= 0);

        do {
            System.out.println("Digite seu sexo utilizando f ou m: ");
            sexo = Character.toLowerCase(sc.next().charAt(0));
        } while (sexo != 'f' && sexo != 'm');

        do {
            System.out.println("Digite seu Estado Civil:\ns = Solteiro\nc = Casado\nv = Viuvo\nd = Divorciado");
            estadoCivil = Character.toLowerCase(sc.next().charAt(0));
        } while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd');

        System.out.println("Nome digitado: " + nome);
        System.out.println("Idade digitada: " + idade);
        System.out.println("Salario digitado: " + salario);
        System.out.println("Sexo digitado: " + sexo);
        System.out.println("Estado Civil digitado: " + estadoCivil);

        sc.close();

    }

}