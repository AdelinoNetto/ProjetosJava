package application;

import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;
/*
 *  FaÃ§a um programa para ler as medidas dos lados de dois triangulo X e Y
(suponha medidas validas). Em seguida mostrar o valor das areas dos dois triangulos
e dizer qual dos dois triangulos possui a maior area. Usando ORIENTAÇÃO A OBJETO
formula de HERON:
 p = (a + b + c) / 2.0;
 area = Math.sqrt(p * (p-a) * (p-b) * (p-c))
 */

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the mesuares of triangle X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangule Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangle X area: %.4f%n" , areaX);
        System.out.printf("Triangle Y area: %.4f%n" , areaY);

        if(areaX > areaY) {
            System.out.printf("Larger area: X");
        } else {
            System.out.printf("Larger area: Y");
        }

        sc.close();
    }

}