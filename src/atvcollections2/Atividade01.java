package atvcollections2;
/*
 * Escreva um programa contendo uma Collection Queue (Fila) de Objetos do tipo string, para organizar uma fila por ordem de chegada dos Clientes de um Banco. O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
1: Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente.
2: Listar todos os Clientes na fila
3: Chamar (retirar) uma pessoa da fila 
0: O programa deve ser finalizado. 
 */

import java.util.LinkedList;
import java.util.Scanner;


public class Atividade01 {
    public static void main(String[] args) {
        System.out.println("Atividade 01 - Collections");

        Scanner scanner = new Scanner(System.in);
        LinkedList<String> clientes = new LinkedList<String>();

        int opcao;

        while(true){
            System.out.println("Menu");
            System.out.println("1 - Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente.");
            System.out.println("2 - Listar todos os Clientes na fila");
            System.out.println("3 - Chamar (retirar) uma pessoa da fila");
            System.out.println("0 - O programa deve ser finalizado.");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do cliente: ");
                    String cliente = scanner.next();
                    clientes.add(cliente);
                    break;
                case 2:
                    System.out.println("lista de clientes: ");
                    for (String item : clientes) {
                        System.out.println(item);
                    }
                    break;
                case 3:      
                    System.out.println("Livro retirado: " + clientes.remove());        
                    break;
                case 0:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }  
        }
    }
}