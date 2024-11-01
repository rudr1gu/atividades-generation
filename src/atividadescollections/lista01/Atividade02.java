package atividadescollections.lista01;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Escreva um programa Java para criar uma Collection ArrayList de Objetos da Classe Wrapper Integer,
 *  inicializada com 10 valores inteiros. 
 * O programa deverá solicitar ao usuário, que ele digite via teclado 1 número inteiro e caso ele seja encontrado no ArrayList, 
 * exiba na tela a posição deste número na Collection. Caso o número não seja encontrado, ele deverá exibir na tela a mensagem:
 * O número NN não foi encontrado!

 */

public class Atividade02 {
    public static void main(String[] args) {
        System.out.println("Atividade 02 - Collections");
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<Integer>();

        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }

        System.out.println("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numeros.contains(numero)) {
            System.out.println("O número " + numero + " foi encontrado na posição " + numeros.indexOf(numero));
        } else {
            System.out.println("O número " + numero + " não foi encontrado!");
        }
        scanner.close();
    }
}