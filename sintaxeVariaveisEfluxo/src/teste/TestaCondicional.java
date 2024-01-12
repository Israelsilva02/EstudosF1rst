package teste;

public class TestaCondicional {
    public static void main(String[] args) {

        int idade = 20;
        int quantidadePessoas = 3;
        if (idade >= 18) {
            System.out.println("Maior de 18 anos vish charopadao vai entrando!");
            System.out.println("Mais uma atividade");
        } else {
            if (quantidadePessoas >= 2) {
                System.out.println("Voce e só uma charopadinha porém precisa entrar com responsavel");
            }else {

                System.out.println("Voce não pode entrar pois não esta com reponsavel e nem e maior de 18 anos!");

                System.out.println("Testando charopada");
            }
        }
    }
}