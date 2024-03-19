package br.com.ada.livraria;

import java.util.ArrayList;
import java.util.List;

public class Livraria {
    List<Livro> livros;

    public Livraria(List<Livro> livros) {
        this.livros = livros;
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void exibirLivros() {
        for (Livro livro : livros) {
            System.out.println("O Codigo do livro é: " + livro.getCodigo());
            System.out.println("O Autor do livro é: " + livro.getAutor());
            System.out.println("O Titulo do livro é: " + livro.getTitulo());


        }
    }

    public Livro procurarLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                System.out.println("Livro encontrado");
                return livro;
            }

        }
        System.out.println("Livro não encotrado!");
        return null;

    }

    public void checkoutLivro(Livro livro, Membro membro) {
        if (livro.isDisponivel()){
            livro.reservar();
            System.out.println("Livro reservado para " + membro.getNome());

        }else {
            System.out.println("Livro indisponivel");
        }


    }

    public void checkinLivro(Livro livro) {
        livro.liberar();
        System.out.println("Livro disponivel");
    }

}

