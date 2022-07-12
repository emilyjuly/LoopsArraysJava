package loops;

/* Desenvolva um gerador de tabuada
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10
o usuário deve informar de qual número ele deseja ver a tabuada
a saída deve ser conforme o exemplo abaixo

Tabuada de 5:
5 x 1 = 5
 */

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        int numero, i;

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o número da tabuada: ");
        numero = scan.nextInt();

        System.out.println("Tabuada de " + numero + ":");
        for(i = 0; i <= 10; i++) {
            System.out.println(numero + " X " + i + " = " + (numero * i));
        }

    }
}
