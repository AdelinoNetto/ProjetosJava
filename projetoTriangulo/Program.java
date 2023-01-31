package application1;

import java.util.Locale;
import java.util.Scanner;
/*
 *  Faça um programa para ler as medidas dos lados de dois triangulo X e Y
(suponha medidas validas). Em seguida mostrar o valor das areas dos dois triangulos
e dizer qual dos dois triangulos possui a maior area.
formula de HERON:
 p = (a + b + c) / 2.0;
 area = Math.sqrt(p * (p-a) * (p-b) * (p-c))
 */

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double xA, xB, xC, yA, yB, yC;

        System.out.println("Enter the mesuares of triangle X:");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Enter the measures of triangule Y:");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p-xA) * (p-xB) * (p-xC));

        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p-yA) * (p-yB) * (p-yC));

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

