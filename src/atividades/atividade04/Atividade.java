package atividades.atividade04;

import java.util.Scanner;

public class Atividade {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        float numero1, numero2, numero3, numero4, diferenca;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Atividade 04");

        System.out.println("Digite o primeiro número: ");
        numero1 = scanner.nextFloat();

        System.out.println("Digite o segundo número: ");
        numero2 = scanner.nextFloat();

        System.out.println("Digite o terceiro número: ");
        numero3 = scanner.nextFloat();

        System.out.println("Digite o quarto número: ");
        numero4 = scanner.nextFloat();
    
        diferenca = (numero1 * numero2) - (numero3 * numero4);

        System.out.println("A diferença do produto do primeiro par pelo produto do segundo par é: " + diferenca);
    }
    
}
