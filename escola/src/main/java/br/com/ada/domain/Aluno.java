package br.com.ada.domain;

import java.time.LocalDate;

public class Aluno extends Pessoa{
    private String matricula;
    private String serie;


    public Aluno(String nome, LocalDate dataNascimento, String matricula,String serie) {
        super(nome, dataNascimento);
        this.matricula = matricula;
        this.serie = serie;
    }

    public void alterarSerie(String novaSerie){
        if (novaSerie == null || novaSerie.isEmpty()){
            throw new IllegalArgumentException("Serie não pode ser nulo ou vazio");
        }
        this.serie = novaSerie;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getSerie() {
        return serie;
    }
}
