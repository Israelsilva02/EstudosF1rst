package teste;

public class TestaConversao {
    public static void main(String[]args){
        double salario = 4000;


        int valor = (int) salario;
        System.out.println(valor);

        long numeroGrande = 3434353553645l;
        short valorPequeno = 2132;
        byte b = 123;


        double valor1 = 0.2;
        double valor2 = 0.1;
        double total = valor1 + valor2;

        System.out.println(total);

        int idade = 20;
        System.out.println("A idade de Marcos é 30!");
        int trinta = 10 + 20;
        System.out.println("A idade de Marcos é " + trinta);

        double idadeDb = 30.0;
        System.out.println("A idade de Marcos é " + (int) idade + "!");


        int idadeTr = 3 * 10;
        System.out.println("A idade de Marcos é " + idade + "!");

        int idadeRt = 30;
        System.out.println("A idade de Marcos é " + idade + "!");

    }
}
