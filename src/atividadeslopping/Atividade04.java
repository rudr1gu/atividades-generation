package atividadeslopping;

import java.util.Scanner;

//Uma empresa desenvolveu uma pesquisa interna para conhecer os colaboradores da área de Desenvolvimento e precisam de um sistema para analisar os dados. Escreva um algoritmo em Java, que leia via teclado as seguintes informações de cada colaborador:

public class Atividade04 {
    public static void main(String[] args) {
        int idade, genero, pessoaDev, devBeckend = 0, mulheresFrontend = 0, homensFrontend = 0, homensMaiores40 = 0, naoBinariosFullStack = 0, totalPessoas = 0, somaIdade = 0;
        boolean continuar = true;


        Scanner scanner = new Scanner(System.in);

        while (continuar) {
            System.out.println("Digite a idade da Pessoa: ");
            idade = scanner.nextInt();
            System.out.println("Digite o gênero\n1 - Mulher Cis\n2 - Homens Cis\n3 - Não Binario\n4 - Mulher Trans\n5 - Homen Trans\n6 - Outros ): ");
            genero = scanner.nextInt();
            System.out.println("Digite o cago:\n1 - Backend\n2 - Frontend\n3 - Mobile\n4 - FullStack");
            pessoaDev = scanner.nextInt();

            System.out.println("Deseja continuar? (s/n)");
            continuar = scanner.next().equalsIgnoreCase("s");

            if(idade < 0 || genero < 1 || genero > 6 || pessoaDev < 1 || pessoaDev > 4) {
                System.out.println("Dados inválidos");
                break;
            }

            if(pessoaDev == 1) {
                devBeckend++;
            } else if(pessoaDev == 2 && (genero == 1 || genero == 4)) {
                mulheresFrontend++;
            } else if(pessoaDev == 2 && (genero == 2 || genero == 5) && idade > 40) {
                homensFrontend++;
            } else if(pessoaDev == 3 && (genero == 2 || genero == 5) && idade > 40) {
                homensMaiores40++;
            } else if(pessoaDev == 4 && genero == 3 && idade < 30) {
                naoBinariosFullStack++;
            }

            totalPessoas++;
            somaIdade += idade;
        }

        float mediaIdade = somaIdade / totalPessoas;

        System.out.println("O numero de pessoas desenvolvedoras Backend: " + devBeckend);
        System.out.println("O número de Mulheres Cis e Trans desenvolvedoras Frontend: " + mulheresFrontend);
        System.out.println("O número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + homensFrontend);
        System.out.println("O número de Não Binários desenvolvedores FullStack menores de 30 anos: " + naoBinariosFullStack);
        System.out.println("O número total de pessoas que responderam à pesquisa: " + totalPessoas);
        System.out.printf("A média de idade das pessoas que responderam à pesquisa: %.2f", mediaIdade);

        scanner.close();
    }
}