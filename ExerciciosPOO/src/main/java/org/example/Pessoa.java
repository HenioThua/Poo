package org.example;

public class Pessoa {
    private String nome;
    private int tamanhoDoPe;
    private String nomeDaMae;

    public Pessoa(String nome, int tamanhoDoPe, String nomeDaMae){
        this.nome = nome;
        this.tamanhoDoPe = tamanhoDoPe;
        this.nomeDaMae = nomeDaMae;
    }
    public Pessoa(String nome, int tamanhoDoPe){
        this.nome = nome;
        this.tamanhoDoPe = tamanhoDoPe;
    }
    public void alterarNome(String nome){
        this.nome = nome;

    }
    public void alterarNomeDaMae(String nomeDaMae){
        this.nomeDaMae = nomeDaMae;
    }


}
