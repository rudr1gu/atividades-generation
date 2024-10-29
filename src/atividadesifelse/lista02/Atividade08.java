package atividadesifelse.lista02;

import java.util.Scanner;

// Desenvolva um algoritmo em Java para uma conta bancária. O programa deverá ler o tipo de operação a ser realizada com base na tabela abaixo (número inteiro entre 1 e 3) e o valor a ser depositado ou sacado (somente nas opções 2 e 3). Considere que um saque só pode ser realizado caso haja saldo suficiente. Ao final de cada operação, exiba o novo Saldo na tela. A variável saldo (float), será inicializada com o valor de R$ 1000.00. Caso a operação seja diferente do intervalo 1 a 3, mostre a mensagem Operação Inválida!

public class Atividade08 {
    public static void main(String[] args) {
        System.out.println("Atividade 08");

        Scanner scanner = new Scanner(System.in);

        float saldo = 1000.00f;

        System.out.println("Digite o tipo de operação: ");
        System.out.println("1 - Consultar Saldo");
        System.out.println("2 - Sacar");
        System.out.println("3 - Depositar");

        int operacao = scanner.nextInt();

        switch (operacao) {
            case 1:
                System.out.println("Saldo: R$ " + saldo);
                break;
            case 2:
                System.out.println("Digite o valor a ser sacado: ");
                float saque = scanner.nextFloat();
                if (saque <= saldo) {
                    saldo -= saque;
                    System.out.println("Saque realizado com sucesso!");
                    System.out.println("Saldo: R$ " + saldo);
                } else {
                    System.out.println("Saldo insuficiente!");
                }
                break;
            case 3:
                System.out.println("Digite o valor a ser depositado: ");
                float deposito = scanner.nextFloat();
                saldo += deposito;
                System.out.println("Depósito realizado com sucesso!");
                System.out.println("Saldo: R$ " + saldo);
                break;
            default:
                System.out.println("Operação Inválida!");
                break;
        }
        scanner.close();
    }
}