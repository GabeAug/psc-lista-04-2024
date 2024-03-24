
/**Altere o programa anterior permitindo ao usuário informar as populações e as taxas de crescimento iniciais.
 *  Valide a entrada e permita repetir a operação.
 */

import java.util.Scanner;

public class exercicio_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int popA;
        int popB;
        int anos = 0;
        double crescimentoA;
        double crescimentoB;
        String novamente;

        System.out.println("Digite o valor da população A: ");
        popA = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o valor da população B: ");
        popB = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o valor de crescimento A: ");
        crescimentoA = sc.nextDouble();
        sc.nextLine();
        System.out.println("Digite o valor de crescimento B: ");
        crescimentoB = sc.nextDouble();
        sc.nextLine();

        while (popA <= popB) {
            popA += (crescimentoA / 100) * popA;
            popB += (crescimentoB / 100) * popB;
            anos++;
        }
        System.out.println("População do país A: " + popA);
        System.out.println("População do país B: " + popB);
        System.out.println("A população do país A vai demorar " + anos + " anos para ultrapassar a população do país B");
        
        System.out.println("Deseja realizar a conta novamente? Digite sim ou não: ");
        novamente = sc.nextLine();

        sc.close();

    }
}