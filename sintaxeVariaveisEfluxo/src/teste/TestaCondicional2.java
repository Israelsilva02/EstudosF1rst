package teste;



public class TestaCondicional2 {
    public static void main(String[] args) {
        int idadee = 68;
        boolean ehIdoso = idadee >= 65;
        System.out.println(ehIdoso);


        int idade = 19;

        int quantidadePessoas = 3;
        boolean acompanhado = quantidadePessoas >= 2;
        System.out.println(" Valor de acompanhado = " + acompanhado);
        if (idade >= 18 && acompanhado) {
            System.out.println("Maior de 18 anos vish charopadao vai entrando!");
            System.out.println("Seja Bem Vindo");
        } else {
           System.out.println("Voce não pode entrar pois não esta com reponsavel e nem e maior de 18 anos!");


            }

        }
    }
