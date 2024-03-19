package com.ada.ecommerce.servico;

import com.ada.ecommerce.Identificador;
import com.ada.ecommerce.dominio.CNPJ;
import com.ada.ecommerce.dominio.CPF;
import com.ada.ecommerce.dominio.Cliente;
import com.ada.ecommerce.dominio.ClienteGateway;

import java.util.List;

public class ClienteServico {

    private ClienteGateway clienteGateway;

    /*
        ESSE CONTRUTOR MOSTRA O PROCESSO DE INJEÇÃO DE DEPENDENCIA
        ACONTECENDO

        A INTERFACE CLIENTE GATEWAY ESTA SENDO INJETADA DENTRO
        DA CLASSE CLIENTE SERVICO
     */
    public ClienteServico(ClienteGateway clienteGateway){
        this.clienteGateway = clienteGateway;
    }

    public void incluir(Identificador id,
                        String nome,
                        String email,
                        String endereco){

        Cliente cliente = new Cliente(id, nome, email, endereco);

        clienteGateway.cadastrar(cliente);

    }

    public void alterar(String id,
                        String nome,
                        String email,
                        String endereco){

        Cliente cliente = clienteGateway.buscarPorId(id);

        cliente.alterarNome(nome);
        cliente.alterarEmail(email);
        cliente.alterarEndereco(endereco);

        clienteGateway.atualizar(id, cliente);

    }

    public Cliente localizarCliente(String id){

        Cliente cliente = clienteGateway.buscarPorId(id);

        return cliente;
    }

    public List<Cliente> listarClientes(){
        return clienteGateway.listarTodos();
    }

}
