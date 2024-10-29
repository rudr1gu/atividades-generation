package atividadesifelse.lista01;

import java.util.Scanner;

public class Atividade03 {
    //Para doar sangue é necessário ter entre 18 e 69 anos de idade. Pessoas com idade entre 60 e 69 anos, só podem doar se não for a sua primeira doação. Escreva um Algoritmo em Java que obtenha via teclado o nome do doador (String), a idade (inteiro) do doador e se é a primeira doação (boolean). De acordo com as Regras para a doação, mostre na tela se o doador está Apto ou Não Apto para doar sangue. Veja os exemplos abaixo:
   
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nome;
        int idade;
        int menu;
        boolean primeiraDoacao;

        System.out.println("Atividade 03");

        System.out.println("Digite o nome do doador: ");
        nome = scanner.nextLine();

        System.out.println("Digite a idade do doador: ");
        idade = scanner.nextInt();

        System.out.println("Digite 1 para primeira doação ou 2 para não primeira doação: ");
        menu = scanner.nextInt();

        if (menu == 1) {
            primeiraDoacao = true;
        } else {
            primeiraDoacao = false;
        }

        if (idade >= 18 && idade <= 69) {
            if (idade >= 60 && idade <= 69) {
                if (primeiraDoacao) {
                    System.out.println("O doador " + nome + " está apto para doar sangue");
                } else {
                    System.out.println("O doador " + nome + " não está apto para doar sangue");
                }
            } else {
                System.out.println("O doador " + nome + " está apto para doar sangue");
            }
        } else {
            System.out.println("O doador " + nome + " não está apto para doar sangue");
        }

        

        scanner.close();
    }
}