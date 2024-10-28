package atividades.atividade01;

import java.util.Scanner;

public class Atividade {
    @SuppressWarnings("resource")
    public static void main(String[] args) {

        float salario, abono, novoSalario;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o salário: ");
        salario = scanner.nextFloat();

        System.out.println("Digite o abono: ");
        abono = scanner.nextFloat();

        novoSalario = salario + abono;

        System.out.println("O novo salário é: " + novoSalario);        
    }

}
