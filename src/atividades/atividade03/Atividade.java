package atividades.atividade03;

import java.util.Scanner;

public class Atividade {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o salário bruto: ");
        salarioBruto = scanner.nextFloat();

        System.out.println("Digite o valor do adicional noturno: ");
        adicionalNoturno = scanner.nextFloat();

        System.out.println("Digite o valor das horas extras: ");
        horasExtras = scanner.nextFloat();

        System.out.println("Digite o valor dos descontos: ");
        descontos = scanner.nextFloat();

        salarioLiquido = salarioBruto + adicionalNoturno + (100 * horasExtras) - descontos;

        System.out.println("O salário líquido é: " + salarioLiquido);
    }
}
