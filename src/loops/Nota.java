package loops;

/*Faça um programa que peça uma nota entre 0 e 10
mostre uma mensagem caso o valor seja inválido e continue pedindo
até que o usuário informe um valor válido
 */

import java.util.Scanner;

public class Nota {

    public static void main(String[] args) {
        int nota;

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Entre com uma nota entre 0 e 10: ");
            nota = scan.nextInt();

            if (nota >= 0 && nota <= 10) {
                System.out.println("Nota válida.");
                break;
            }
            else {
                System.out.println("Insira uma nota válida!");
            }
        }
    }
}
