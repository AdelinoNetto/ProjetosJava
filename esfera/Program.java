package application;
/*Faça um programa para ler um valor numerico qualquer e dai mostrar quanto seria
* o valor de um circunferencia e do volume de uma esfera para um raio daquele valor.
* Informe tambem o valor de PI com duas casas decimais.*/

import util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = Calculator.circunference(radius);
        double v = Calculator.volume(radius);

        System.out.printf("Circunferencia: %.2f%n" , c);
        System.out.printf("Volume: %.2f%n" , v);
        System.out.printf("PI: %.2f%n" , Calculator.PI);

        sc.close();
    }
}
