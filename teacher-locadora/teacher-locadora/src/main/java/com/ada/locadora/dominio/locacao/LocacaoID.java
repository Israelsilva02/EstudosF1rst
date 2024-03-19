package com.ada.locadora.dominio.locacao;

import com.ada.locadora.dominio.Identificador;

public class LocacaoID extends Identificador<Integer> {

    private static Integer id = 0;

    private Integer valor;

    private LocacaoID() {
        id++;
        this.valor = id;
    }

    public static LocacaoID criar() {
        return new LocacaoID();
    }

    @Override
    public Integer valor() {
        return valor;
    }

    @Override
    public String toString() {
        return "LocacaoID{" +
                "valor=" + valor +
                '}';
    }
}
