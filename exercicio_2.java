/*Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário, 
*mostrando uma mensagem de erro e voltando a pedir as informações.*/

import java.util.Scanner;

public class exercicio_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome, senha;

        System.out.println("Digite seu usuario: ");
        nome = scanner.nextLine();

        System.out.println("Digite sua senha: ");
        senha = scanner.nextLine();

        while (nome.equals(senha)) { // Utilizando o método da class para testar a relação de igualdade (Fonte de
                                     // pesquisa DevMedia)
            System.out.println("Senha deve ser diferente do nome, digite novamente: ");
            senha = scanner.nextLine();
        }
        System.out.println("Bem vindo, " + nome + "!");
        scanner.close();
    }

}