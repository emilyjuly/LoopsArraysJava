package loops;

/*Faça um programa que leia 5 números
informe o maior número
e a média desses números
 */

import java.util.Scanner;

public class MaioreMedia {

    public static void main(String[] args) {
        int i, numero, maiorNumero = 0, soma = 0;
        float media;

        Scanner scan = new Scanner(System.in);

        for (i = 0; i < 5; i++) {
            System.out.println("Número: ");
            numero = scan.nextInt();
            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
            soma += numero;
        }
        media = (soma / 5);
        System.out.println("O maior número é " + maiorNumero);
        System.out.println("A média entre os números é " + media);
    }
}
