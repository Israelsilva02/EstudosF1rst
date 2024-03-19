public class Cliente {
    public static void main(String[] args) {

        double mediaAprovacao = 6.5;
        double[][] aluno = {
                {7.5,8,6.5,6},//cliente 1
                {8,1.5,5.5,3.8},//cliente 2
                {1.5,3,2,1.5}//cliente 3
        };


        for (int i = 0; i < aluno.length; i++) {
            for (int j = 0; j < aluno[i].length; j++) {
                somaMedia += aluno[i][j];


            }
            System.out.println("A media do Aluno é: " + somaMedia);


            somaMedia = 0;
        }
    }
}