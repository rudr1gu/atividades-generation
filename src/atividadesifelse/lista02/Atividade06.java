package atividadesifelse.lista02;

import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {
        System.out.println("Atividade 06");
       

        Scanner scanner = new Scanner(System.in);

        String nome;
        String cargo = "";
        // int codigo;
        float salario;
        float reajuste = 0.0f;
        float salarioReajustado;


        System.out.println("Digite o nome do colaborador: ");
        nome = scanner.nextLine();

        System.out.println("Digite o salário do colaborador: ");
        salario = scanner.nextFloat();

        System.out.println("#      Colaborador          #");
        System.out.println("Código do Cargo |Cargo        | Percentual do Reajuste");
        System.out.println("1               |Gerente      | 10%");
        System.out.println("2               |Vendeor      | 7%");
        System.out.println("3               |Supervisor   | 9%");
        System.out.println("4               |Motorista    | 6%");
        System.out.println("5               |Estoquista   | 5%");
        System.out.println("6               |Tecnico de TI| 8%");

        System.out.println("-----------------------------------------------");

        System.out.println("Digite o código do cargo: ");
        int codigo = scanner.nextInt();

        switch (codigo) {
            case 1:
                cargo = "Gerente";
                reajuste = (salario * 10) / 100;
                break;
            case 2:
                cargo = "Vendedor";
                reajuste = (salario * 7) / 100;
                break;
            case 3:
                cargo = "Supervisor";
                reajuste = (salario * 9) / 100;
                break;
            case 4:
                cargo = "Motorista";
                reajuste = (salario * 6) / 100;
                break;
            case 5:
                cargo = "Estoquista";
                reajuste = (salario * 5) / 100;
                break;
            case 6:
                cargo = "Técnico de TI";
                reajuste = (salario * 8) / 100;
                break;
            default:
                System.out.println("Código inválido");
                break;
        }

        salarioReajustado = salario + reajuste;
        
        System.out.println("Nome do Colaborador: " + nome);
        System.out.println("Cargo " + cargo);
        System.out.printf("Salário: %.2f R$ ", salarioReajustado);
        
        scanner.close();
    }

}
