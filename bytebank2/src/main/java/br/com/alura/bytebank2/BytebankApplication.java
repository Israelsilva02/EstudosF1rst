package br.com.alura.bytebank2;


import br.com.alura.bytebank2.domain.RegraDeNegocioException;
import br.com.alura.bytebank2.domain.cliente.DadosCadastroCliente;
import br.com.alura.bytebank2.domain.conta.ContaService;
import br.com.alura.bytebank2.domain.conta.DadosAberturaConta;


import java.sql.SQLException;
import java.util.Scanner;

public class BytebankApplication {
    private static ContaService service = new ContaService();
    private static Scanner teclado = new Scanner(System.in).userDelimiter("\n");

    public static void main(String[] args) {
        var opcao = exibirMenu();
        while (opcao != 8) {
            try {
                switch (opcao) {
                    case 1:
                        listarContas();
                        break;
                    case 2:
                        abrirConta();
                        break;
                    case 3:
                        encerrarConta();
                        break;
                    case 4:
                        consultaSaldo();
                        break;
                    case 5:
                        realizarSaque();
                        break;
                    case 6:
                        realizarDeposito();
                        break;

                    case 7:
                        realizarTransferencia();


                }
            } catch (RegraDeNegocioException | SQLException e) {
                System.out.println("Erro: " + e.getMessage());
                System.out.println("Pressione qualquer tecla e de ENTER para voltar ao menu");
                teclado.next();

            }
            opcao = exibirMenu();

        }
        System.out.println("Finalizando a aplicação.");


}

    private static int exibirMenu() {

        System.out.println(

                """
                        BYTEBANK - Escolha uma opção:
                             1 - Listar contas abertas
                             2 - Abertura de Conta
                             3 - Encerramento de conta
                             4 - Consultar saldo de uma conta
                             5 - Realizar saque em uma conta
                             6 - Realizar deposito em uma conta
                             7 - Realizar Transferencia
                             8 - Sair     """);


        return teclado.nextInt();
    }
    private static void listarContas(){
        System.out.println("Contas Cadastradas: ");
        var contas = service.listarContasAbertas();
        contas.stream().forEach(System.out::println);

        System.out.println("Pressione qualquer tecla e de Enter para voltar ao menu principal");
        teclado.next();
    }

    private static void abrirConta() throws SQLException {
        System.out.println("Digite o número da Conta: ");
        var numeroDaConta = teclado.next();

        System.out.println("Digite o nome do Cliente: ");
        var nome = teclado.next();
        System.out.println("Digite o CPF do Cliente: ");
        var cpf = teclado.next();
        System.out.println("Digite o email do Cliente: ");
        var email = teclado.next();

        service.abrir(new DadosAberturaConta(numeroDaConta, new DadosCadastroCliente(nome, cpf, email)));


        System.out.println("Conta aberta com sucesso ! ");

        System.out.println("Pressione qualquer tecla e de ENTER para voltar ao menu principal ");
        teclado.next();


    }
    private static void encerrarConta(){
        System.out.println("Digite o numero da conta: ");
        var numeroDaConta = teclado.nextInt();

        service.encerrar(numeroDaConta);

        System.out.println("Conta encerrada com sucesso !");
        System.out.println("Pressione qualquer tecla e de ENTER para voltar ao menu principal ");
        teclado.next();
    }
    private static void consultaSaldo(){
        System.out.println("Digite o numero da conta: ");
        var numeroDaConta = teclado.nextInt();
        var saldo = service.consultarSaldo(numeroDaConta);
        System.out.println("Saldo da conta: " + saldo);

        System.out.println("Pressione qualquer tecla e de ENTER para voltar ao menu principal");
        teclado.next();

    }

    private static void realizarSaque() {

        System.out.println("Digite o número da Conta: ");
        var numeroDaConta = teclado.nextInt();


        System.out.println("Digite o valor do saque: ");
        var valor = teclado.nextBigDecimal();

        service.realizarSaque(numeroDaConta, valor);

        System.out.println("Saque realizado com sucesso!");
        System.out.println("Pressione qualquer tecla e de ENTER para voltar ao menu principal ");
        teclado.next();
    }
    private static void realizarDeposito(){
        System.out.println("Digite o numero da conta: ");
        var numeroDaConta = teclado.nextInt();
        System.out.println("Digite o valor do deposito: ");
        var valor = teclado.nextBigDecimal();

        service.realizarDeposito(numeroDaConta, valor);

        System.out.println("Deposito realizado com sucesso!");
        System.out.println("Pressione qualquer tecla e de ENTER para voltar ao menu principal ");
        teclado.next();

    }
    private static void realizarTransferencia(){
        System.out.println("Digite o numero da conta de origem: ");
        var numeroDaContaOrigem = teclado.nextInt();

        System.out.println("Digite o numero da conta destino: ");
        var numeroDaContaDestino = teclado.nextInt();

        System.out.println("Digite o valor a ser transferido: ");
        var valor = teclado.nextBigDecimal();

        service.realizarTransferencia(numeroDaContaOrigem, numeroDaContaDestino, valor);

        System.out.println("Transferencia realizada com sucesso !");
        System.out.println("Pressione qualquer tecla e de ENTER para voltar ao menu principal ");
        teclado.next();

    }
}

