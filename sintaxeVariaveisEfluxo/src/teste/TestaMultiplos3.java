package teste;

public class TestaMultiplos3 {
    public static void main(String[] args) {

        int numero = 0;

        for (numero = 1; numero <= 100; numero++)

        if (numero % 3  == 0) {
            System.out.println(numero);
            System.out.print(" ");
        }
    }
}
