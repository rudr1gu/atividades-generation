package atividadescollections.lista01;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Escreva um programa Java para criar uma Collection ArrayList de Objetos da Classe String. 
 * O programa deverá solicitar ao usuário, que ele digite via teclado 5 cores e deverá adicioná-las individualmente no ArrayList.
 * Em seguida, faça o que se pede:
 * Mostre na tela todas as cores que foram adicionadas. 
 * Mostre na tela todas as cores que foram adicionadas ordenadas em ordem crescente.
 */

public class Atividade01 {
    public static void main(String[] args) {
        System.out.println("Atividade 01 - Collections");
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> cores = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite uma cor: ");
            cores.add(scanner.nextLine());
        }

        System.out.println("Cores adicionadas: \n");
        for (String cor : cores) {
            System.out.println(cor);
        }

        cores.sort(null);
        System.out.println("Cores adicionadas ordenadas: \n");
        for (String cor : cores) {
            System.out.println(cor);
        }
        
        scanner.close();
    }   
}