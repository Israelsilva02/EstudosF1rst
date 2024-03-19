package br.com.ada.livraria;

public class Livro {
    private Integer codigo;
    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro(Integer codigo, String titulo, String autor, boolean disponivel) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;

    }

    public void reservar(){
        if (isDisponivel()) {
            this.disponivel = false;

        }else {
            System.out.println("Livro não disponivel!!");
        }
    }
    public void liberar(){
        this.disponivel =true;

    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", disponivel=" + disponivel +
                '}';
    }
}
