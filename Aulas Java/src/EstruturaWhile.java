import java.util.Scanner;

public class EstruturaWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: (0 para parar)");
        int x = sc.nextInt();
        while(x != 0) {
            System.out.println("Digite outro número: ");
            x = sc.nextInt();
        }
        sc.close();
    }
}