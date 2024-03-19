package com.ada.locadora.dominio.cliente.objetos;

public class CEP {

    private final String valor;

    private CEP(String valor) {
        this.valor = valor;
        this.validate();
    }

    public static CEP criar(String valor) {
        return new CEP(valor);
    }

    private void validate() {
        if (valor == null || valor.length() != 8) {
            throw new IllegalArgumentException("CEP inválido");
        }
    }

    public String valor() {
        return valor;
    }

    @Override
    public String toString() {
        return "CEP{" +
                "valor='" + valor + '\'' +
                '}';
    }
}
