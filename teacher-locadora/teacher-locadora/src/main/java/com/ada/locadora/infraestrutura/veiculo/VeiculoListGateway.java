package com.ada.locadora.infraestrutura.veiculo;

import com.ada.locadora.dominio.veiculo.Veiculo;
import com.ada.locadora.dominio.veiculo.VeiculoGateway;

import java.util.ArrayList;
import java.util.List;

public class VeiculoListGateway implements VeiculoGateway {

    List<Veiculo> veiculos = new ArrayList<>();

    @Override
    public void salvar(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    @Override
    public void atualizar(Veiculo veiculo) {
        veiculos.remove(veiculo);
        veiculos.add(veiculo);
    }

    @Override
    public Veiculo buscarPorId(String id) {

        for (Veiculo veiculo : veiculos) {
            if (veiculo.getPlaca().valor().equals(id)) {
                return veiculo;
            }
        }
        throw new RuntimeException("Veiculo não encontrado");
    }


    @Override
    public List<Veiculo> buscarTodos() {
        return veiculos;
    }
}
