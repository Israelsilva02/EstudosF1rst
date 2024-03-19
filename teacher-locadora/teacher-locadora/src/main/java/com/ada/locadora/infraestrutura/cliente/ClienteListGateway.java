package com.ada.locadora.infraestrutura.cliente;

import com.ada.locadora.dominio.cliente.Cliente;
import com.ada.locadora.dominio.cliente.ClienteGateway;

import java.util.ArrayList;
import java.util.List;

public class ClienteListGateway implements ClienteGateway {

    //Simulando um banco de dados em memória
    //Lista de Cliente

    List<Cliente> clientes = new ArrayList<>();

    @Override
    public void salvar(Cliente cliente) {
        clientes.add(cliente);
    }

    @Override
    public void atualizar(Cliente cliente) {
        clientes.remove(cliente);
        clientes.add(cliente);
    }

    @Override
    public Cliente buscarPorId(String id) {

        for (Cliente cliente : clientes) {
            if (id.equals(String.valueOf(cliente.id().valor()))) {
                return cliente;
            }
        }

        throw new RuntimeException("Cliente não encontrado");
    }

    @Override
    public List<Cliente> buscarTodos() {
        return clientes;
    }
}
