
public class EstruturaWhile {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Digite um valor: (0 para parar)");
        // int x = sc.nextInt();

        // int soma = 0;
        // while(x != 0) {
        //     soma += x;
        //     System.out.println("Digite outro número: ");
        //     x = sc.nextInt();
        // }

        // System.out.println("O valor da soma de todos os números digitados foi de: " + soma);
        // sc.close(); 

        // int x = 2;
        // int y = 10;
        // while(x < y){ 
        //     System.out.println(x + "-" + y);
        //     x =  x * 2;
        //     y = y + 1;
        // }

        // System.out.println("FIM");

        int x = 4;
        int y = 0;
        int i = 0;
        while(i < x) {
            i += 1;
            y += i;
            System.out.println(i);
            System.out.println(y);
        }
    }
}