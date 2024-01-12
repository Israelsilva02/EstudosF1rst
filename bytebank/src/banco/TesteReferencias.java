package banco;

public class TesteReferencias {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;

        System.out.println("saldo da primeira: " + primeiraConta.saldo);

        Conta segundaConta = primeiraConta;
        segundaConta.saldo += 500;
        System.out.println("saldo da primeira: " + primeiraConta.saldo);


        System.out.println("saldo da primeira: " + primeiraConta.saldo);

        if (primeiraConta == segundaConta){
            System.out.println("São a mesma conta!@!");
        }else {
            System.out.println("Contas diferentes!");
        }
        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }
}
