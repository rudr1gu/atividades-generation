package atividadesvetores.lista01;

import java.util.Scanner;

//Elabore um algoritmo que leia 10 números inteiros e armazene em um vetor. Em seguida, mostre na tela:
// Todos os elementos dos índices ímpares do vetor 
// Todos os elementos do vetor que são números pares
// A Soma de todos os elementos do vetor
// A Média de todos os elementos do vetor, armazenada em uma variável do tipo real


public class Atividade02 {
    public static void main(String[] args) {
        System.out.println("Atividade 02 - Vetores");

        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        float soma = 0, media = 0;


        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um número: ");
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            if (i % 2 != 0) {
                System.out.println("Elemento do índice ímpar: " + numeros[i]);
            } else {
                System.out.println("Elemento par: " + numeros[i]);
            }

            soma += numeros[i];
        }

        media = soma / numeros.length;
        System.out.println("Soma dos elementos: " + soma);
        System.out.println("Média dos elementos: " + media);

        scanner.close();
    }
}