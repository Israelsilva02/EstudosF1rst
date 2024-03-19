package com.ada.ecommerce.dominio;

import com.ada.ecommerce.Identificador;

public class CNPJ extends Identificador<String> {

    private final String numero;

    public CNPJ(String valor) {
        if (valor == null || valor.length() != 14) {
            throw new IllegalArgumentException("CNPJ inválido");
        }
        this.numero = valor;
    }

    @Override
    public String getValor() {
        return numero;
    }

    @Override
    public String nome() {
        return "PJ";
    }
}
