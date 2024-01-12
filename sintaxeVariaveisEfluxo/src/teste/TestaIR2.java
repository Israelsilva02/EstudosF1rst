package teste;

public class TestaIR2 {
    public static void main(String[] args) {
        double salario = 3800.0;
        if(salario <= 1900.0 || salario <= 2800){
            System.out.println("A sua aliquota é de 7.5%");
            System.out.println("Pode deduzir na declaração o valor de R$ 142");

        }else if (salario <= 2800.01 || salario <= 3751.0) {
            System.out.println("A sua aliquota é de 15%");
            System.out.println("Pode deduzir na declaração o valor de R$ 350");
        }else if(salario <= 3751.01 || salario <= 4664.00){
            System.out.println("A sua aliquota é de 22.5%");
            System.out.println("Pode deduzir na declaração o valor de R$ 636");
        }
    }
}
