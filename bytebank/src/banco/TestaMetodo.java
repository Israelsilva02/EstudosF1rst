package banco;

public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaIsrael = new Conta();
        contaIsrael.saldo = 100;
        contaIsrael.deposita(50);

        System.out.println("O saldo em conta é: " + contaIsrael.saldo + " reias !");
        boolean conseguiuRetirar = contaIsrael.saca(20);
        System.out.println("O saldo em conta é: " + contaIsrael.saldo + " reias !");
        System.out.println(conseguiuRetirar);

        Conta contaGabrielle = new Conta();
        contaGabrielle.deposita(1500);
        boolean sucessoTransferencia = contaGabrielle.transfere(60, contaIsrael);

       if( sucessoTransferencia) {
           System.out.println("transferido com sucesso");
        }else{
            System.out.println("Faltou dinheiro");

        }
        System.out.println(contaIsrael.saldo);
        System.out.println(contaGabrielle.saldo);

    }
    }

