package Exercicios2.poo;

abstract public class Mensagem {
    private String texto;
    private String emailRemetente;
    private boolean anonima;

    public Mensagem (String texto,String emailRemetente, boolean anonima){
        this.texto = texto;
        this.emailRemetente = emailRemetente;
        this.anonima = anonima;

    }
    public String getTexto(){
        return texto;
    }
    public void setTexto(String texto){
        this.texto = texto;
    }
    abstract public String getTextoCompletoAExibir();

    public String getEmailRemetente() {
        return emailRemetente;
    }
    public void setEmailRemetente(String emailRemetente){
        this.emailRemetente = emailRemetente;
    }
    public boolean ehAnonima(){
        return anonima;
    }
}
