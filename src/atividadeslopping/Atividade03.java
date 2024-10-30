package atividadeslopping;

import java.util.Scanner;

// Escreva um algoritmo em Java, que leia a idade de várias pessoas (números inteiros), via teclado e mostre na tela o total de pessoas cuja idade seja menor que 21 anos e o total de pessoas cuja idade seja maior que 50 anos. A leitura dos dados deve ser finalizada ao digitar uma idade negativa. Veja o exemplo abaixo:

public class Atividade03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade, menor21 = 0, maior50 = 0;

        System.out.println("Atividade 03");
        System.out.println("###############################################");
        System.out.println("Digite um numero negativo para sair");

        while (true) {
            System.out.println("Digite a idade: ");
            idade = scanner.nextInt();

            if (idade < 0) {
                break;
            }

            if (idade < 21) {
                menor21++;
            } else if (idade > 50) {
                maior50++;
            }
        }
        
        System.out.println("Total de pessoas com menos de 21 anos: " + menor21);
        System.out.println("Total de pessoas com mais de 50 anos: " + maior50);

        scanner.close();
    }
}