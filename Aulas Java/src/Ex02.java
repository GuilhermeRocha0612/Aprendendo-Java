import java.util.Locale;
import java.util.Scanner;

public class Ex02 {
    public static void  main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número:  ");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int n2 = sc.nextInt();

        int soma = n1 + n2;
        System.out.println("O resultado da soma de " + n1 + " e " + n2 + " é igual a: " + soma);

        sc.close();
    }
}
