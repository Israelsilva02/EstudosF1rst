package br.com.ada.domain;

import java.time.LocalDate;

public class Professor extends Pessoa {
    private Integer codigo;
    private String materia;


    public Professor(String nome, LocalDate dataNascimento) {
        super(nome, dataNascimento);
        this.codigo = codigo;
        this.materia = materia;
    }


    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getMateria() {
        return materia;
    }
}
