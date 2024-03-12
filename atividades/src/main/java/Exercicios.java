public class Solution {
    public String matricula;


    public Solution(String matricula){
        this.matricula = matricula;

    }
    public void calcularMediaFinal(String matricula, int nota1, int nota2, int nota_trabalho){
        int mediaFinal = (nota1+nota2+nota_trabalho)/3;
        if(mediaFinal >= 7){
            System.out.println("Aprovado!");
        }else{
            System.out.println("Reprovado!");
        }

    }

}
