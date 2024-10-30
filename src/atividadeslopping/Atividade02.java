package atividadeslopping;

import java.util.Scanner;

//Escreva um algoritmo em Java, que leia 10 números inteiros via teclado e mostre na tela quantos números são pares e quantos número são ímpares. Veja o exemplo abaixo:

public class Atividade02 {

    public static void main(String[] args) {
        System.out.println("Atividade 02");
        int pares = 0, impares = 0;

        System.out.println("###############################################");

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 10; i++) {
            System.out.println("Digite um número: ");
            int numero = scanner.nextInt();
            if(numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Total de números pares: " + pares);
        System.out.println("Total de números ímpares: " + impares);

        scanner.close();
        
    }
}