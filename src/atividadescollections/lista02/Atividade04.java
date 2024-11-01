package atividadescollections.lista02;
/*
 * Escreva um programa Java para criar uma Collection Set de Objetos da Classe Wrapper Integer,
 * inicializada com 10 valores inteiros. 
 * O programa deverá solicitar ao usuário, que ele digite via teclado 1 número inteiro e caso ele seja encontrado no Set,
 * exiba na tela a mensagem: Número 00 Encontrado! Caso o número não seja encontrado, ele deverá exibir na tela a mensagem:
 * O número NN não foi encontrado!
 */

import java.util.HashSet;
import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        System.out.println("Atividade 04 - Collections");

        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> numeros = new HashSet<Integer>();

        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }

        System.out.println("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numeros.contains(numero)) {
            System.out.println("Número " + numero + " foi encontrado!");
        } else {
            System.out.println("O número " + numero + " não foi encontrado!");
        }
        scanner.close();
    }
}