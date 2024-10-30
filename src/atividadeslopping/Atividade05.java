package atividadeslopping;

import java.util.Scanner;

//Escreva um algoritmo em Java, que leia números inteiros via teclado, até que o número zero seja digitado. Ao final, mostre na tela a soma de todos os números digitados, que sejam positivos. Veja o exemplo abaixo:

public class Atividade05 {
    public static void main(String[] args) {
        System.out.println("Atividade 05");
        System.out.println("###############################################");

        Scanner scanner = new Scanner(System.in);
        int numero, soma = 0;
        boolean continuar = true;

        do{
            System.out.println("Digite um número: ");
            numero = scanner.nextInt();
            if(numero == 0){
                continuar = false;
            }else if(numero > 0){
                soma += numero;
            }

        } while(continuar);

        System.out.println("A soma dos números positivos digitados é: " + soma);

        scanner.close();
    }
}