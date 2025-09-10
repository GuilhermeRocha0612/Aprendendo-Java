import java.util.Scanner;

public class EstruturaCondicional1 {
    public static void main (String[] args) {

        System.out.println("Que horas são? ");
        Scanner sc = new Scanner(System.in);
        double hora = sc.nextDouble();
        if(hora < 12 && hora > 5){
            System.out.println("Bom Dia!");
        }else if (hora >= 12 && hora < 18){
            System.out.println("Boa Tarde!");
        }else {
            System.out.println("Boa Noite!");
        }

        sc.close();
    }
}
