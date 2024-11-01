package atividadescollections.lista02;

import java.util.HashSet;
import java.util.Scanner;

/*
 * Escreva um programa Java para criar uma Collection Set de Objetos da Classe Wrapper Integer. 
 * O programa deverá solicitar ao usuário, que ele digite via teclado 10 valores inteiros não repetidos e adicione-os individualmente na Collection Set.
 * Em seguida, faça o que se pede:
 * Mostre na tela todos os elementos da Collection Set, utilizando a Classe Iterator. 
 * Veja o exemplo abaixo:
 */

public class Atividade03 {
    public static void main(String[] args) {
        System.out.println("Atividade 03 - Collections");

        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> numeros = new HashSet<Integer>();

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o "+ (i+1) +"º número inteiro: ");
            int numero = scanner.nextInt();
            numeros.add(numero);
        }

        System.out.println("Números adicionados: ");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        scanner.close();
    }
}