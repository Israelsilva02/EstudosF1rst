package br.com.alura.bytebank2.domain.conta;

import br.com.alura.bytebank2.domain.cliente.DadosCadastroCliente;


public class DadosAberturaConta  {
    public DadosAberturaConta(String numeroDaConta, DadosCadastroCliente dadosCadastroCliente) {
    }

    public record DadosAberturaConta(Integer numero, DadosCadastroCliente dadosCliente) {


    }

}
