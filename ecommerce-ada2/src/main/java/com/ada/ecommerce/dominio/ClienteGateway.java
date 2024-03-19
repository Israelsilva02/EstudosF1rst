package com.ada.ecommerce.dominio;

import java.util.List;

public interface ClienteGateway {

   void cadastrar(Cliente cliente);

    void atualizar(String id, Cliente cliente);


    Cliente buscarPorId(String id);

    List<Cliente> listarTodos();

}
