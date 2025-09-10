import java.util.Scanner;

public class Teste2{
    public static void main (String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double x;
            String y;
            int z;
            x = sc.nextDouble();
            y = sc.next();
            z = sc.nextInt();
            System.out.println("Dados Digitados: ");
            System.out.println(x);
            System.out.println(y);
            System.out.println(z);
        }
    }
}
