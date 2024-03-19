package br.com.alura;

public class TestaVetor {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("israel");
        Aluno aluno2 = new Aluno("Yan");
        Aluno aluno3 = new Aluno("Bernardo");


        Vetor lista = new Vetor();
        System.out.println(lista.tamanho());

        lista.adicionar(aluno1);
        System.out.println(lista.tamanho());

        lista.adicionar(aluno2);
        System.out.println(lista.tamanho());

        System.out.println(lista);
        System.out.println(lista.contem(aluno1));

        System.out.println(lista.contem(aluno3));


        System.out.println(lista.contem(aluno3));

        lista.adiciona(1, aluno3);
        System.out.println(lista);

        lista.remove(1);
        System.out.println(lista);

        for (int i = 0; i < 300; i++) {
            Aluno aluno5 = new Aluno("Roger" + i);
            lista.adiciona(aluno5);
        }
        System.out.println(lista);
    }
}
