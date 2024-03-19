package com.ada.ecommerce.dominio;

import com.ada.ecommerce.Identificador;

public class CPF extends Identificador<String> {

    private String numero;

    public CPF(String numero){
        if (numero.length() != 11){
            throw new IllegalArgumentException("CPF deve ter 11 digitos");
        }
        this.numero = numero;
    }

    @Override
    public String getValor() {
        return numero;
    }

    @Override
    public String nome() {
        return "PF";
    }
}
