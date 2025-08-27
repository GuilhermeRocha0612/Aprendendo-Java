import java.util.Locale;
import java.util.Scanner;

public class Ex06PrecoTotal {
    public static void main (String [] args ) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o código de uma peça: ");
        int codigoPeca1 = sc.nextInt();
        System.out.println("Digite a quantidade que vc deseja levar: ");
        int quantidadePeca1 = sc.nextInt();
        System.out.println("Digite o valor unitário: ");
        double valorPeca1 = sc.nextDouble();
        System.out.println("Digite o código de outra peça: ");
        int codigoPeca2 = sc.nextInt();
        System.out.println("Digite a quantidade que vc deseja levar: ");
        int quantidadePeca2 = sc.nextInt();
        System.out.println("Digite o valor unitário: ");
        double valorPeca2 = sc.nextDouble();

        double valorTotal = (double) quantidadePeca1 * valorPeca1 + (double) quantidadePeca2 * valorPeca2;

        System.out.printf("O Valor total a pagar é de: R$%.2f%n", valorTotal);


    }
}
