package atvcollections2;

import java.util.Scanner;
import java.util.Stack;

/*
 * Escreva um programa contendo uma Collection Stack (Pilha) de Objetos string, para organizar a retirada de livros de uma pilha. O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
1: Adicionar um novo livro na pilha. Deve solicitar o nome do livro.
2: Listar todos os livros da Pilha
3: Retirar um livro da pilha 
0: O programa deve ser finalizado. 
Caso a pilha esteja vazia, ao tentar retirar um livro da pilha, o programa deverá informar que a pilha está vazia.

 */

public class Atividade02 {
    public static void main(String[] args) {

        Stack<String> livros = new Stack<String>();

        Scanner scanner = new Scanner(System.in);
        int opcao;
      
        while (true) {
            System.out.println("Menu");
            System.out.println("1: Adicionar um novo livro na pilha");
            System.out.println("2: Listar todos os livros da Pilha");
            System.out.println("3: Retirar um livro da pilha");
            System.out.println("0: O programa deve ser finalizado");
            System.out.println("Digite a opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do livro: ");
                    String livro = scanner.next();
                    livros.push(livro);
                    break;
                case 2:
                    System.out.println("livros na pilha: ");
                    for (String item : livros) {
                        System.out.println(item);
                    }
                    break;
                case 3:
                    if (livros.isEmpty()) {
                        System.out.println("Pilha vazia");
                    } else {
                        System.out.println("Livro retirado: " + livros.pop());
                    }
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