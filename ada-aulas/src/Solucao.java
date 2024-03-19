import java.util.List;
import java.util.ArrayList;


class Solucao {



    class Veiculo {

        public String placa;
        public String tipo;

        public Veiculo(String placa) {
            this.placa = placa;
        }
    }

    public String getPlaca(){
        return getPlaca();
    }
    public String getTipo(){
        return getTipo();
    }




    class Carro extends  Veiculo{


        public Carro(String placa) {
            super(placa);
            this.tipo = "carro";


        }
    }

    class Moto extends Veiculo{


        public Moto(String placa) {
            super(placa);
            this.tipo = "moto";

        }
    }

    class Estacionamento {
        private List<Veiculo> veiculosEstacionados = new ArrayList<>();


        public void estacionar(Veiculo veiculo) {
            veiculosEstacionados.add(veiculo);
        }

        public Veiculo sairDoEstacionamento(String placa) {
            for (Veiculo veiculo : veiculosEstacionados) {
                if (veiculo.placa.equals(placa)) {
                    veiculosEstacionados.remove(veiculo);
                    return veiculo;
                }

            }
            return null;
        }

        public boolean consultarVeiculo(String placa) {
            for (Veiculo veiculo : veiculosEstacionados) {
                if (veiculo.placa.equals(placa)) {
                    return true;
                }

            }
            return false;
        }

        public int ocupacao() {
            return veiculosEstacionados.size();
        }

    }

}





