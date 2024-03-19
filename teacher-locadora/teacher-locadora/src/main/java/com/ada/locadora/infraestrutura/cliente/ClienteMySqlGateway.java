package com.ada.locadora.infraestrutura.cliente;

import com.ada.locadora.dominio.cliente.Cliente;
import com.ada.locadora.dominio.cliente.ClienteGateway;

import java.util.List;

public class ClienteMySqlGateway implements ClienteGateway {

    //Classe para conectar no banco de dados e salvar/atualizar/buscar cliente

    @Override
    public void salvar(Cliente cliente) {
        //conectar no na base de dados e salvar o cliente
    }

    @Override
    public void atualizar(Cliente cliente) {
        //conectar no na base de dados e atualizar o cliente
    }

    @Override
    public Cliente buscarPorId(String id) {
        //conectar no na base de dados e buscar o cliente
        return null;
    }

    @Override
    public List<Cliente> buscarTodos() {
        //conectar no na base de dados e buscar todos os clientes
        return null;
    }
}
