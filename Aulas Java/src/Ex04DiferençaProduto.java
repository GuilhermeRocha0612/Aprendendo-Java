import java.util.Scanner;

public class Ex04DiferençaProduto {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-----CALCULADORA DE DIFERENÇA ENTRE O PRODUTO A E B PELO PRODUTO DE C E D------");
        System.out.println("Digite o primeiro valor: ");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        int n2 = sc.nextInt();
        System.out.println("Digite o terceiro valor: ");
        int n3 = sc.nextInt();
        System.out.println("Digite o quarto valor: ");
        int n4 = sc.nextInt();

        int diferenca = n1 * n2 - n3 * n4;
        System.out.println("O valor da diferença é: " + diferenca);
    }
}
