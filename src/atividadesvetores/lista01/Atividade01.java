package atividadesvetores.lista01;

import java.util.Scanner;

//Dado um vetor contendo 10 números inteiros não ordenados e não repetidos, construa um algoritmo que consiga pesquisar dados no vetor, onde o usuário irá digitar um número e o programa deve exibir na tela a posição deste número no vetor. Caso o número não seja encontrado, a mensagem: “Não foi encontrado!” deve ser exibida na tela. Veja os exemplos abaixo:

public class Atividade01 {
    public static void main(String[] args) {

        System.out.println("Atividade 01 - Vetores");
       
        Scanner scanner = new Scanner(System.in);
        int[] numeros = {2,5,1,3,4,9,7,8,10,6};

        System.out.println("Digite um número: ");
        int inputNumber = scanner.nextInt();

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == inputNumber) {
                System.out.println("O número " + inputNumber + " está na posição " + i + " do vetor.");
                break;
            }
            if (i == numeros.length - 1) {
                System.out.println("O número "+ inputNumber +"não foi encontrado!");
            }
        }
        scanner.close();    
    }
}