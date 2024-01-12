package br.com.alura.bytebank2.domain;

public class RegraDeNegocioException  extends RuntimeException{
    public RegraDeNegocioException(String mensagem){
        super(mensagem);
    }
}
