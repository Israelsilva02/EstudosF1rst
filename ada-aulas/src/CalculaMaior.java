public class CalculaMaior {
    public static void main(String[] args) {
        int[] numeros = {23, 8, 14, 7, 42, 19, 30};

        int maior = numeros[0];
        int resultado = 0;

        for (int i = 1; i < numeros.length; i++) {
            if (maior > numeros[i]) {
                resultado = maior;

            } else {
                resultado = numeros[i];
                maior = numeros[i];
            }

        }
        System.out.println(resultado);
    }


}


