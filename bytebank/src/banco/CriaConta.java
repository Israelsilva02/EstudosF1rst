package banco;

public class CriaConta extends Conta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;

        primeiraConta.saldo += 100;



        Conta segundaConta = new Conta();
        segundaConta.saldo = 300;

        System.out.println("Primeira Conta tem um saldo de: " + primeiraConta.saldo);
        System.out.println("Segunda Conta tem um saldo de: " + segundaConta.saldo);
        primeiraConta.agencia = 146;
        System.out.println(primeiraConta.agencia);
        System.out.println(primeiraConta.numero);

        System.out.println(segundaConta.agencia);

        segundaConta.agencia = 146;
        System.out.println("Agora a segunda conta ");
        if (primeiraConta == segundaConta){
            System.out.println("São a mesma conta!@!");
        }else {
            System.out.println("Contas diferentes!");
        }
        System.out.println(primeiraConta);
        System.out.println(segundaConta);


    }
}
