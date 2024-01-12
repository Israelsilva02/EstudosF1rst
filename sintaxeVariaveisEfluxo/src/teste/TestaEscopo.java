package teste;

public class TestaEscopo {
    public static void main(String[] args) {
        int idade = 19;

        int quantidadePessoas = 3;
       // boolean acompanhado = quantidadePessoas >= 2;

        boolean acompanhado;
        if(quantidadePessoas >= 2) {
              acompanhado = true;
        }
        else {
             acompanhado = false;
            System.out.println("");
        System.out.println(" Valor de acompanhado = " + acompanhado);
        if (idade >= 18 && acompanhado) {
            System.out.println("Maior de 18 anos vish charopadao vai entrando!");
            System.out.println("Seja Bem Vindo");
        } else {
            System.out.println("Voce não pode entrar pois não esta com responsavel e nem e maior de 18 anos!");


        }


    }
}
    }

