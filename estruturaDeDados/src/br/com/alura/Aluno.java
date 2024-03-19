package br.com.alura;

import java.util.Objects;

public class Aluno {
    private String nome;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(Object obj) {
     //   if (obj == null )return false;
        Aluno aluno = (Aluno) obj;
        return aluno.getNome().equals(nome);
    }

    @Override
    public String toString() {
        return nome;
    }
}
