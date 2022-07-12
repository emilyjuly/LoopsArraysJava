package loops;

/*Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário
Ex.: 5! = 120
 */

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        int fatorial, i, multiplicacao = 1;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número do fatorial: ");
        fatorial = scan.nextInt();

        System.out.print(fatorial + "! = ");
        for(i = fatorial; i >= 1; i--) {
            multiplicacao = multiplicacao * i;
        }

        System.out.println(multiplicacao);
    }
}
