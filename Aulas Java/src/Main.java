import java.util.Locale;

public class Main {
    public static void main (String[] args) {

        String product1 = "Computador";
        String product2 = "Celular";

        int age = 20;
        int code = 6972;
        char gender = 'M';

        double price1 = 6700.00;
        double price2 = 1580.00;
        double measure = 62.91283123;

        System.out.println("Products: ");
        System.out.printf("%s cujo preço é R$ %.2f%n", product1, price1);
        System.out.printf("%s cujo preço é R$ %.2f%n", product2, price2);

        System.out.printf("Histórico: %d anos de idade, código: %d gênero: %s %n", age, code, gender);
        System.out.printf("Medida com oito casas decimais: %.8f%n", measure);
        System.out.printf("Medida com três casas decimais: %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("Medida com três casas decimais e utilizando ponto ao invés da virgula: %.3f%n", measure);

    }
}
