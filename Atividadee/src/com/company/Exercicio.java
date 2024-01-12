package com.company;

import java.math.BigDecimal;

public class Exercicio {

    public void realizarSaque(Integer numeroDaConta, BigDecimal valor) throws RegraDeNegocioException {
        var conta = buscarContaPorNumero(numeroDaConta);
        if (valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw new RegraDeNegocioException("Valor do saque deve ser superior a zero!");
        }

        if (valor.compareTo(conta.getSaldo()) > 0) {
            throw new RegraDeNegocioException("Saldo insuficiente!");
        }

        if (!conta.getEstaAtiva()) {
            throw new RegraDeNegocioException("Conta não está ativa!");
        }
        alterar(conta, valor);
    }
-
    private void buscarContaPorNumero(Integer numeroDaConta) {
    }
}