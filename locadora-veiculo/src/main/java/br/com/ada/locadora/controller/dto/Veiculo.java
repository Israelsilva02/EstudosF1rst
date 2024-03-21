package br.com.ada.locadora.controller.dto;

import java.util.Objects;

public class Veiculo {
    private String placa;
    private String descricao;
    private int ano;




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Veiculo)) return false;
        Veiculo veiculo = (Veiculo) o;
        return ano == veiculo.ano && Objects.equals(placa, veiculo.placa)
                && Objects.equals(descricao, veiculo.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(placa, descricao, ano);
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "placa='" + placa + '\'' +
                ", descricao='" + descricao + '\'' +
                ", ano=" + ano +
                '}';
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
