package atividadesvetores.lista02;

import java.util.Scanner;

//Elabore um algoritmo que leia uma Matriz 3x3 de números inteiros e em seguida, mostre na tela:
// Todos os elementos da Diagonal Principal
// Todos os elementos da Diagonal Secundária
// A Soma de todos os elementos da Diagonal Principal
// A Soma de todos os elementos da Diagonal Secundária


public class Atividade03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int[] diagonalPrincipal = new int[3];
        int[] diagonalSecundaria = new int[3];
        int somaDiagonalPrincipal = 0;
        int somaDiagonalSecundaria = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Digite um numero: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    diagonalPrincipal[i] = matriz[i][j];
                    somaDiagonalPrincipal += matriz[i][j];
                }
                if (i + j == matriz.length - 1) {
                    diagonalSecundaria[i] = matriz[i][j];
                    somaDiagonalSecundaria += matriz[i][j];
                }
            }
        }

        System.out.println("Elementos da Diagonal Principal: ");
        for (int i = 0; i < diagonalPrincipal.length; i++) {
            System.out.println(diagonalPrincipal[i]);
        }

        System.out.println("Elementos da Diagonal Secundária: ");
        for (int i = 0; i < diagonalSecundaria.length; i++) {
            System.out.println(diagonalSecundaria[i]);
        }

        System.out.println("Soma dos Elementos da Diagonal Principal: " + somaDiagonalPrincipal);
        System.out.println("Soma dos Elementos da Diagonal Secundária: " + somaDiagonalSecundaria);
        
        scanner.close();
    }
}