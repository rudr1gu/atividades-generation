package atividadesifelse.lista01;

import java.util.Scanner;

public class Atividade04 {
    //Escreva um algoritmo em Java, que leia 3 palavras (String), que definem as características de um tipo de animal possível segundo o diagrama abaixo, que deve ser lido da esquerda para a direita.
    public static void main(String[] args) {

        System.out.println("");
        System.out.println("Atividade 04");
        System.out.println("###############################################");
 
        Scanner scanner = new Scanner(System.in);
        int menu;

        System.out.println("Digite  1 - vertebrado ou 2 - invertebrado: ");
        menu = scanner.nextInt();

        if (menu == 1) {
            System.out.println("Digite 1 - ave ou 2 - mamífero: ");
            menu = scanner.nextInt();
            if (menu == 1) {
                System.out.println("Digite 1 - carnívoro ou 2 - onívoro: ");
                menu = scanner.nextInt();
                if (menu == 1) {
                    System.out.println("É uma águia");
                } else {
                    System.out.println("É um pombo");
                }
            } else {
                System.out.println("Digite 1 - onívoro ou 2 - herbívoro: ");
                menu = scanner.nextInt();
                if (menu == 1) {
                    System.out.println("É um homem");
                } else {
                    System.out.println("É uma vaca");
                }
            }
        } else {
            System.out.println("Digite 1 - inseto ou 2 - anelídeo: ");
            menu = scanner.nextInt();
            if (menu == 1) {
                System.out.println("Digite 1 - hematofago ou 2 - herbívoro: ");
                menu = scanner.nextInt();
                if (menu == 1) {
                    System.out.println("É uma pulga");
                } else {
                    System.out.println("É uma lagarta");
                }
            } else {
                System.out.println("Digite 1 - hematofago ou 2 - onívoro: ");
                menu = scanner.nextInt();
                if (menu == 1) {
                    System.out.println("É uma sanguessuga");
                } else {
                    System.out.println("É uma minhoca");
                }
            }
        }
        scanner.close();
    }
}