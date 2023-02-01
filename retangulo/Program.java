package application;

import entities.Retangulo;

import java.util.Locale;
import java.util.Scanner;
/*
Faça um programa para ler os valores da largura e altura de um retangulo.
Em seguida, mostrar na tela o valor de sua area, perimetro e diagonal.
*/

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();

        System.out.print("Informe a largura do retangulo: ");
        retangulo.largura = sc.nextDouble();

        System.out.print("Informe a altura do retangulo: ");
        retangulo.altura = sc.nextDouble();

        System.out.printf("\nArea do retangulo: %.2f" , retangulo.areaRetangulo());
        System.out.printf("\nPerimetro do retangulo: %.2f" , retangulo.perimetroRetangulo());
        System.out.printf("\nDiagonal do retangulo: %.2f" , retangulo.diagonalRetangulo());

    }
}
