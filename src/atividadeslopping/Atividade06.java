package atividadeslopping;
//Escreva um algoritmo em Java, que leia números inteiros via teclado, até que o número zero seja digitado. Ao final, mostre na tela a média de todos os números digitados, que sejam múltiplos de 3. Veja o exemplo abaixo:

import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {
        System.out.println("Atividade 06");
        System.out.println("###############################################");

        Scanner scanner = new Scanner(System.in);
        int numero, soma = 0, total = 0;
        boolean continuar = true;

        do{
            System.out.println("Digite um número: ");
            numero = scanner.nextInt();
            if(numero == 0){
                continuar = false;
            }else if(numero % 3 == 0){
                soma += numero;
                total++;
            }

        } while(continuar);

        float media = soma / total;

        System.out.println("A média dos números múltiplos de 3 digitados é: " + media);

        scanner.close();
    }

}
