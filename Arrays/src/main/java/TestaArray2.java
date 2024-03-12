import java.util.Objects;

public class TestaArray2 {
    public static void main(String[] args) {
        Cliente[] clientes = new Cliente[10];

        System.out.println(clientes[0]);

        for (int i = 0; i < clientes.length; i++) {
            clientes[i] = new Cliente();
            clientes[i].nome = "Mario";
        }
        for (Cliente c : clientes
        ) {
            System.out.println(c.nome);

        }
        Cliente clientes2[] = new Cliente[5];
        clientes[0] = new Cliente();
        clientes2[1] = new ClienteEspecial();


        Cliente israel = new Cliente();
        israel.nome = "Israel";

        clientes2[0] = israel;

        System.out.println(israel.nome);
        System.out.println(clientes2[0].nome);


//        int[] valores = new int[10];
//        long numeros[] = (long[]) valores;

        String[] nomes = {"israel, bernardo"};
        Object[] objetos;
        objetos = nomes;

        for (Object o : objetos) {
            System.out.println(o);
//         int[] array = new int[10];
//
//         int array2[] = new int[10];
//
//         int[] array3 = new int[];
//
//         int array4[] = new int[];
//
//        int[] array5 = new int[2]{1, 2};
//
//         int[] array6 = new int[]{1, 2};
//
//         int[] array7 = int[10];
//
//         int[] array8 = new int[1, 2, 3];
//
//         int array9[] = new int[1, 2, 3];
//
//        int array10[] = {1, 2, 3};
//        }
//

        }


    }

    static class Cliente {
        String nome;
    }

    static class ClienteEspecial extends Cliente {
    }
}