package atividadesifelse.lista01;

import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        float a,b,c, soma;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Atividade 01");

        System.out.println("Digite o valor de A: ");
        a = scanner.nextFloat();

        System.out.println("Digite o valor de B: ");
        b = scanner.nextFloat();

        System.out.println("Digite o valor de C: ");
        c = scanner.nextFloat();

        soma = a + b;

        if (soma > c) {
            System.out.println("A soma de A e B é maior que C");
        }else if (soma == c) {
            System.out.println("A soma de A e B é igual a C");
        } else {
            System.out.println("A soma de A e B é menor que C");
        }
        scanner.close();

    
    }  
}