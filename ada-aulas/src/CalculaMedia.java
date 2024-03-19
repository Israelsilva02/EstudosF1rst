public class CalculaMedia {
    public static void main(String[] args) {
        double[] precos = {7,8,9,10,11,12,13};
    }
    public static double calcularMedia(double[] precos){
        double resultado= 0;

        for (double preco: precos) {

            resultado = resultado +preco;

        }
        double media = resultado/precos.length;

    return resultado;
    }

}
//    Dado o array int[] numeros = {23, 8, 14, 7, 42, 19, 30};
//        Desejo que você encontrem o maior número dentro deste array. :-)
