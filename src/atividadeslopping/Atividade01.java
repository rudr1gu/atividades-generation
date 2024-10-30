package atividadeslopping;

import java.util.Scanner;

//Escreva um algoritmo em Java, que leia 2 números inteiros via teclado, onde o primeiro número deve ser menor do que o segundo número. Caso contrário, deve ser exibida uma mensagem na tela informando que o intervalo é inválido e sair do programa. 
//No intervalo informado, mostre na tela todes os números que são múltiplos de 3 e 5. Veja os exemplos abaixo:

public class Atividade01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;

        System.out.println("Digite o primeiro número: ");
        num1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("Intervalo inválido");
            System.exit(0);
        }

        for (int i = num1; i <= num2; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " é múltiplo de 3 e 5");
            }
        }
        
        scanner.close();
    }
}
