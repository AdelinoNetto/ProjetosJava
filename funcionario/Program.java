package application;
/*Faça um programa para ler os dados do funcionario(nome, salario bruto, e imposto)
* Em seguida, mostrar os dados do funcionario (nome e salario liquido).
* Em seguida, aumentar o salario com base em porcentagem dada (somente o salario
* bruto é afetado pela porcentagem), e mostrar os dados, novamente.  */

import entities.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.print("Informe nome do funcionario: ");
        funcionario.name = sc.nextLine();

        System.out.print("Informe o salario do funcionario: ");
        funcionario.salarioLiquido = sc.nextDouble();

        System.out.print("Qual a taxa de desconto do funcionario: ");
        funcionario.taxa = sc.nextDouble();

        System.out.println(funcionario);

        System.out.println();
        System.out.println("Entre com a porcentagem do salario: ");
        double porcentagem = sc.nextDouble();

        funcionario.porcentagemSalario(porcentagem);
        System.out.println(funcionario);

        sc.close();
    }
}
