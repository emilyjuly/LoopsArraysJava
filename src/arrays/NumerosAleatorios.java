package arrays;

import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] aleatorios = new int[20];

        for (int i = 0; i < aleatorios.length; i++) {
            int numero = random.nextInt(100);
            aleatorios[i] = numero;
        }

        System.out.println("Números aletatórios: ");
        for (int numero : aleatorios) {
            System.out.println(numero + " ");
        }

        System.out.println("Sucessores dos números aleatórios: ");
        for (int numero : aleatorios) {
            System.out.println((numero + 1) + " ");
        }
    }
}
