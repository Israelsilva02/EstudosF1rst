package com.ada.ecommerce.dominio;

import com.ada.ecommerce.Identificador;

public class Cliente {

    private final Identificador id;
    private final String tipo;
    private String nome;
    private String email;
    private String endereco;

    public Cliente(Identificador id, String nome, String email, String endereco) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.tipo = id.nome();
        validar();
    }

    private void validar(){

        if (id == null || id.equals("")){
            throw new IllegalArgumentException("Id não pode ser nulo ou vazio");
        }

        if (nome == null || nome.equals("")){
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio");
        }

        if (email == null || email.isEmpty()){
            throw new IllegalArgumentException("Email não pode ser nulo ou vazio");
        }

        if (endereco == null || endereco.isEmpty()){
            throw new IllegalArgumentException("Endereço não pode ser nulo ou vazio");
        }
    }

    public void alterarNome(String novoNome){
        if (novoNome == null || novoNome.isEmpty()){
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio");
        }
        this.nome = novoNome;
    }

    public void alterarEmail(String novoEmail){
        if (novoEmail == null || novoEmail.isEmpty()){
            throw new IllegalArgumentException("Email não pode ser nulo ou vazio");
        }
        this.email = novoEmail;
    }

    public void alterarEndereco(String novoEndereco){
        if (novoEndereco == null || novoEndereco.isEmpty()){
            throw new IllegalArgumentException("Endereço não pode ser nulo ou vazio");
        }
        this.endereco = novoEndereco;
    }

    public String getId() {
        return id.toString();
    }

    public String getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
