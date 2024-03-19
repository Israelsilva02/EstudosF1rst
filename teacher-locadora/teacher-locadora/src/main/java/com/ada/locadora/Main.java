package com.ada.locadora;

import com.ada.locadora.dominio.cliente.Cidade;
import com.ada.locadora.dominio.cliente.Cliente;
import com.ada.locadora.dominio.cliente.ClienteGateway;
import com.ada.locadora.dominio.cliente.Endereco;
import com.ada.locadora.dominio.cliente.objetos.CEP;
import com.ada.locadora.dominio.cliente.objetos.CPF;
import com.ada.locadora.dominio.locacao.Locacao;
import com.ada.locadora.dominio.locacao.LocacaoGateway;
import com.ada.locadora.dominio.veiculo.TipoVeiculo;
import com.ada.locadora.dominio.veiculo.Veiculo;
import com.ada.locadora.dominio.veiculo.VeiculoGateway;
import com.ada.locadora.dominio.veiculo.VeiculoID;
import com.ada.locadora.infraestrutura.cliente.ClienteListGateway;
import com.ada.locadora.infraestrutura.locacao.LocacaoListGateway;
import com.ada.locadora.infraestrutura.veiculo.VeiculoListGateway;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        VeiculoGateway veiculoGateway = new VeiculoListGateway();
        ClienteGateway clienteGateway = new ClienteListGateway();
        LocacaoGateway locacaoGateway = new LocacaoListGateway();

        VeiculoID veiculoID = VeiculoID.criar("ABC1234");
        Veiculo veiculo = Veiculo.criar(veiculoID, "Fiat", TipoVeiculo.MEDIO);
        veiculoGateway.salvar(veiculo);
        List<Veiculo> veiculos = veiculoGateway.buscarTodos();
        veiculos.forEach(System.out::println);


        CPF cpf = CPF.criar("12345678901");
        CEP cep = CEP.criar("12345678");
        Cidade cidade = Cidade.criar("São Paulo", "SP");
        Endereco endereco = Endereco.criar(cep, "Rua X", "Centro", cidade);
        Cliente cliente = Cliente.criar(cpf, "João", "joao@test.com", endereco);
        clienteGateway.salvar(cliente);
        List<Cliente> clientes = clienteGateway.buscarTodos();
        clientes.forEach(System.out::println);


        Locacao locacao = Locacao.criar(cliente);
        locacao.alugar(veiculo, "Aeroporto", 5);
       locacao.devolver();
        System.out.println(locacao.calcularValor());
        locacaoGateway.salvar(locacao);
        List<Locacao> locacoes = locacaoGateway.buscarTodos();
        locacoes.forEach(System.out::println);
        locacao.alugar(veiculo,"Geração Digital", 4);
        locacao.devolver();

    }
}