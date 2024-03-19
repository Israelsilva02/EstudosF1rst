package br.com.ada.domain;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private Integer codigo;
    private String nome;
    private List<Aluno> alunos = new ArrayList<>();
    private Professor professor;

    public Curso(Integer codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public void definirProfessor(Professor professor) {
        this.professor = professor;
    }

    public void matricularAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    public void exibirAluno() {
        for (Aluno aluno : alunos) {
            System.out.println("Dados aluno" + aluno.getNome());

        }

    }


    public Integer getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public Professor getProfessor() {
        return professor;
    }
}
