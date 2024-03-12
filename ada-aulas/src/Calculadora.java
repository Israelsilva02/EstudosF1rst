import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {


        int a = 0;
        int b = 0;
        double resultado = 0;

        Scanner scanner = new Scanner(System.in);

        String operacao = "";

        System.out.println("Digite o primeiro numero");
        a = scanner.nextInt();

        System.out.println("Digite a operação ");
        operacao = scanner.next();

        System.out.println("Digite o segundo numero");
        b = scanner.nextInt();


        Operadores operadores = Operadores.valueOf(operacao);

        switch (operadores) {
            case ADICAO:
                resultado = a + b;
                break;
            case SUBTRACAO:
                resultado = a - b;
                break;
            case DIVISAO:
                resultado = a / b;
                break;
            case MULTIPLICACAO:
                resultado = a * b;
                break;


        }

        System.out.println(resultado);
    }
}
