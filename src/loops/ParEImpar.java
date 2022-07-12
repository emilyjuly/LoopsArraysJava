package loops;

/*Faça um programa que peça N número inteiros
calcule e mostre a quantidade de números pares
e a quantidade de números impares
 */

import java.util.Scanner;

public class ParEImpar {

    public static void main(String[] args) {
        int numero, quant, i, par = 0, impar = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe quantos números serão digitados: ");
        quant = scan.nextInt();

        for (i = 0; i < quant; i++){
            System.out.println("Digite o número: ");
            numero = scan.nextInt();
            if (numero % 2 == 0){
                par += 1;
            }
            else {
                impar += 1;
            }
        }
        System.out.println("Existem " + par + " números pares e " + impar + " números impares");
    }
}
