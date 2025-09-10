import java.util.Locale;
import java.util.Scanner;

public class Ex03ValorAreaRaio {
    public static void main (String[] args ) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("---------Calculadora de área de um raio--------");
        System.out.println("Digite o valor do raio: ");
        double valorRaio = sc.nextDouble();
        double pi = 3.14159;
        double area = pi * (Math.pow(valorRaio, 2.0));

        System.out.println("-----RESULTADO-----");
        System.out.printf("O valor da área é igual a: %.4f%n", area);
        sc.close();
    }
}
