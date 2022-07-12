package loops;

//Faça um programa que leia um conjunto de dois valores
//O primeiro representando o nome do aluno e o segundo representando a sua idade
//Pare inserindo o valor 0 no campo nome

import java.util.Scanner;

public class NomeEIdade {

    public static void main(String[] args) {
        String nome;
        int idade;

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Entre com um nome ou 0 para encerrar: ");
            nome = scan.next();
            if (nome.equals("0"))
                break;
            else
                System.out.println("Entre com a idade: ");
                idade = scan.nextInt();
        }
        System.out.println("Você saiu do programa");
    }
}
