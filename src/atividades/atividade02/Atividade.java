package atividades.atividade02;

import java.util.Scanner;

public class Atividade {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        float nota1,nota2,nota3,nota4,media;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Atividade 02");

        System.out.println("Digite a primeira nota: ");
        nota1 = scanner.nextFloat();

        System.out.println("Digite a segunda nota: ");
        nota2 = scanner.nextFloat();

        System.out.println("Digite a terceira nota: ");
        nota3 = scanner.nextFloat();

        System.out.println("Digite a quarta nota: ");
        nota4 = scanner.nextFloat();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.printf("A média final é: %.1f", media);
    }

}