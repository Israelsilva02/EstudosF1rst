package br.com.ada.livraria;

import java.util.ArrayList;
import java.util.List;

public class TestaLivraria {
    public static void main(String[] args) {

        Livraria livraria = new Livraria(new ArrayList<>());

        Livro livro1 = new Livro(1, "Solid", "Wenceslau", false);
        Livro livro2 = new Livro(2, "Interface", "Wenceslau", true);
        Livro livro3 = new Livro(3, "Generics", "Wenceslau", true);


        Membro membro1 = new Membro("Gabriel");
        Membro membro2 = new Membro("Israel");
        Membro membro3 = new Membro("Jhenny");


        livraria.adicionarLivro(livro1);
        livraria.adicionarLivro(livro2);
        livraria.adicionarLivro(livro3);

        livraria.checkoutLivro(livro1, membro1);
        livraria.checkinLivro(livro2);
        livraria.checkoutLivro(livro3, membro3);

        System.out.println("");
        System.out.println("");
        System.out.println("");


    }


}
