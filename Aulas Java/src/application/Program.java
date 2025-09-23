package application;

import entities.Triangle;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();
        
        System.out.println("Adicione as medidas do triangulo X: ");

        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Adicione as medidas do triangulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();

        double areaY = y.area();
        
        System.out.printf("Area Triangulo X: %.4f%n", areaX);
        System.out.printf("Area Triangulo Y: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.printf("A maior area é a: X com %.4f%n", areaX);
        } else {
            System.out.printf("A maior area é a área: Y com %.4f%n", areaY);
        }

        sc.close();
    }    

}
