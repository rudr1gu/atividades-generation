package atividadesifelse.lista01;

import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        ///Escreva um algoritmo em Java, que leia um número inteiro via teclado e mostre na tela uma mensagem indicando se este número é par ou ímpar e se o número é positivo ou negativo. Veja os exemplos abaixo:

        System.out.println("Atividade 02");

        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número: ");
        numero = scanner.nextInt();

        if (numero % 2 == 0 ) {
            System.out.println("O número é par");
            if (numero > 0) {
                System.out.println("O número é positivo");
            } else {
                System.out.println("O número é negativo");
            }
        } else {
            System.out.println("O número é ímpar");
            if (numero > 0) {
                System.out.println("O número é positivo");
            } else {
                System.out.println("O número é negativo");
            }
        }

        scanner.close();
    }
    
}