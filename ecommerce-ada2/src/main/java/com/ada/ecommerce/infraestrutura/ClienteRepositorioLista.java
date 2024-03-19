package com.ada.ecommerce.infraestrutura;

import com.ada.ecommerce.dominio.Cliente;
import com.ada.ecommerce.dominio.ClienteGateway;

import java.util.ArrayList;
import java.util.List;

public class ClienteRepositorioLista implements ClienteGateway {

    private List<Cliente> clientes = new ArrayList<>();

    @Override
    public void cadastrar(Cliente cliente) {
        clientes.add(cliente);
    }

    @Override
    public void atualizar(String id, Cliente cliente) {
        Cliente clienteAhRemover = buscarPorId(id);
        clientes.remove(clienteAhRemover);
        clientes.add(cliente);
    }

    @Override
    public Cliente buscarPorId(String id) {

        for(Cliente cliente: clientes){

            if (cliente.getId().equals(id)){
                return cliente;
            }

        }

        throw new IllegalArgumentException("Cliente não encontrado");
    }

    @Override
    public List<Cliente> listarTodos() {
        return clientes;
    }
}
