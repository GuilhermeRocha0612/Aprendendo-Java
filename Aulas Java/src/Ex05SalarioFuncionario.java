import java.util.Locale;
import java.util.Scanner;

public class Ex05SalarioFuncionario {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o nome do funcionário? ");
        String nome = sc.next();
        System.out.println("Quantas horas ele trabalhou? ");
        int horas = sc.nextInt();
        System.out.println("Qual o valor da hora trabalhada? ");
        double valorHora = sc.nextDouble();

        double salario = (double) horas * valorHora;
        System.out.println("Nome do funcionário: " + nome);
        System.out.printf("Salário: R$%.2f%n",  salario);

    }
}
