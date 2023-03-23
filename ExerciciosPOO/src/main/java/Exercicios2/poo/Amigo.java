package Exercicios2.poo;

public class Amigo {
    private String nome;
    private String email;
    private String amigoSorteado;

    public Amigo(String nome, String email, String amigoSorteado){
        this.nome = nome;
        this.email = email;
        this.amigoSorteado = amigoSorteado;

    }
    public String getNome(){
        return this.nome;

    }
    public void setNome (String nome){
        this.nome = nome;

    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;

    }
    public String getAmigoSorteado(){
        return this.amigoSorteado;
    }
    public void setAmigoSorteado(String amigoSorteado){
        this.amigoSorteado = amigoSorteado;
    }


}
