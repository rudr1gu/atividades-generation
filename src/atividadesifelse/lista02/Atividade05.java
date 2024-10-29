package atividadesifelse.lista02;

import java.util.Scanner;

// Com base na tabela abaixo, escreva um algoritmo em Java
// que leia o código de um item (número inteiro de 1 a 6)
// e a quantidade comprada deste item (número inteiro).
// A seguir, mostre na tela o valor total da conta e o 
// nome do produto que foi comprado.

public class Atividade05 {
    public static void main(String[] args) {
        System.out.println("Atividade 05");

        Scanner scanner = new Scanner(System.in);
        int codigo, quantidade;
        double valorTotal = 0;
        String produto = "";

        //lista de produtos
        System.out.println("");
        System.out.println("#      Lista de produtos          #");
        System.out.println("Código | Produto         | Valor");
        System.out.println("1      | Cachorro Quente | R$ 10.00");
        System.out.println("2      | X-Salada        | R$ 15.00");
        System.out.println("3      | X-Bacon         | R$ 18.00");
        System.out.println("4      | Bauru           | R$ 12.00");
        System.out.println("5      | Refrigerante    | R$ 8.00");
        System.out.println("6      | Suco de Laranja | R$ 13.00");
        System.out.println("");

        System.out.println("Digite o código do produto: ");
        codigo = scanner.nextInt();

        System.out.println("Digite a quantidade: ");
        quantidade = scanner.nextInt();

        switch (codigo) {
            case 1:
                produto = "Cachorro Quente";
                valorTotal = quantidade * 10.00;
                break;
            case 2:
                produto = "X-Salada";
                valorTotal = quantidade * 15.00;
                break;
            case 3:
                produto = "X-Bacon";
                valorTotal = quantidade * 18.00;
                break;
            case 4:
                produto = "Bauru";
                valorTotal = quantidade * 12.00;
                break;
            case 5:
                produto = "Refrigerante";
                valorTotal = quantidade * 8.00;
                break;
            case 6:
                produto = "Suco de Laranja";
                valorTotal = quantidade * 13.00;
                break;
            default:
                System.out.println("Código inválido");
                break;
        }

        System.out.println("Produto: " + produto);
        System.out.println("Valor total: " + valorTotal);

        scanner.close();
    }
    
}
