import java.util.Locale;
import java.util.Scanner;

public class EstruturaDoWhile {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        char resposta;

        do {
            System.out.println("Digite o valor da temperatura em Celsius: ");
            double temperaturaC = sc.nextDouble();
            double temperaturaF = 9.0 * temperaturaC / 5.0 + 32.0;
            System.out.printf("Valor em Fahrenheit: %.1f%n", temperaturaF);
            System.out.println("Deseja continuar? (s/n)");
            resposta = sc.next().charAt(0);
        } while (resposta != 'n');

        sc.close();
    }
}
