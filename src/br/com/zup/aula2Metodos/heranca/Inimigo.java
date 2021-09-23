package br.com.zup.aula2Metodos.heranca;

public class Inimigo {
    private String nome;
    private double vida;

    public Inimigo() {
    }

    public Inimigo(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }
    public void trocar(String nome){
        this.setNome(nome);
    }
    public void receber(double dano){
        vida = vida - dano;
    }
    public void exibirVida(){
        System.out.println("Vida: " + vida);
    }
    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Vida: " + vida);
    }
}
