package com.ada.locadora.dominio.cliente;

import com.ada.locadora.dominio.Identificador;
import com.ada.locadora.dominio.cliente.objetos.CPF;
import com.ada.locadora.dominio.cliente.objetos.TipoPessoa;

public class Cliente {

    private final Identificador id;
    private final TipoPessoa tipoPessoa;
    private String nome;
    private String email;
    private Endereco endereco;

    private Cliente(Identificador id, String nome, String email, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;

        if (id instanceof CPF){
            this.tipoPessoa = TipoPessoa.FISICA;
        }else{
            this.tipoPessoa = TipoPessoa.JURIDICA;
        }
        validar();
    }

    public static Cliente criar(Identificador id, String nome, String email, Endereco endereco) {
        return new Cliente(id, nome, email, endereco);
    }

    public void atualizarEndereco(Endereco novoEndereco){
        this.endereco = novoEndereco;
    }

    public void altearNome(String novoNome) {
        this.nome = novoNome;
    }

    public void alterarEmail(String novoEmail) {
        this.email = novoEmail;
    }

    public Identificador id() {
        return id;
    }

    public TipoPessoa tipo() {
        return tipoPessoa;
    }

    public String nome() {
        return nome;
    }

    public String email() {
        return email;
    }

    public Endereco endereco() {
        return endereco;
    }

    private void validar() {
        if (id == null) {
            throw new RuntimeException("ID não pode ser nulo");
        }

        if (nome == null || nome.trim().isEmpty()) {
            throw new RuntimeException("Nome não pode ser nulo");
        }

        if (email == null || email.trim().isEmpty()) {
            throw new RuntimeException("Email não pode ser nulo");
        }
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", tipo=" + tipoPessoa +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}
