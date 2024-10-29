package atividadesifelse.lista02;

import java.util.Scanner;

public class Atividade07 {
    //Com base na tabela abaixo, escreva um algoritmo em Java, que simule uma Calculadora simples. O programa deverá ler dois números float: numero1 e numero2, e na sequência ler o Código da operação matemática (número inteiro de 1 a 4). A seguir, mostre na tela o resultado da operação entre os 2 números. Caso a operação seja diferente do intervalo 1 a 4, mostre a mensagem Operação Inválida!

    public static void main(String[] args) {
        System.out.println("Atividade 07");

        Scanner scanner = new Scanner(System.in);
        float numero1, numero2;
        int operacao;

        System.out.println("Digite o primeiro número: ");
        numero1 = scanner.nextFloat();

        System.out.println("Digite o segundo número: ");
        numero2 = scanner.nextFloat();

        System.out.println("Digite o código da operação matemática: ");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        operacao = scanner.nextInt();

        switch (operacao) {
            case 1:
                System.out.println("O resultado da soma é: " + (numero1 + numero2));
                break;
            case 2:
                System.out.println("O resultado da subtração é: " + (numero1 - numero2));
                break;
            case 3:
                System.out.println("O resultado da multiplicação é: " + (numero1 * numero2));
                break;
            case 4:
                if (numero2 != 0) {
                    System.out.println("O resultado da divisão é: " + (numero1 / numero2));
                } else {
                    System.out.println("Não é possível dividir por zero");
                }
                break;
            default:
                System.out.println("Operação Inválida!");
                break;
        }

        scanner.close();
    }
}
