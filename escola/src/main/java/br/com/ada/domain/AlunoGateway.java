package br.com.ada.domain;

public interface AlunoGateway {
    void inserirAluno(Aluno aluno);

    Aluno buscarPorMatricula(String matricula);

    void atualizar(String matricula, Aluno aluno);

}
