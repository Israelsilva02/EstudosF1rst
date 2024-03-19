import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();


        if (numero <= 1)

            System.out.println("Número não Primo");

        else {
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    System.out.println("Número não é Primo!!!!");
                    break;

                } else {
                    System.out.println("Número Primo!!!");
                    break;
                }

            }

        }
    }
}