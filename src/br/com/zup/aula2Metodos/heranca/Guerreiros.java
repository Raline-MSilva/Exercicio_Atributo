package br.com.zup.aula2Metodos.heranca;

public class Guerreiros extends Heroi{
    private double poderAtaque;

    public Guerreiros() {

    }

    public Guerreiros(String nome, double vida, double poderAtaque) {
        super(nome, vida);
        this.poderAtaque = poderAtaque;
    }

    public double getPoderAtaque() {
        return poderAtaque;
    }

    public void setPoderAtaque(double poderAtaque) {
        this.poderAtaque = poderAtaque;
    }
    public double aplicarDano(){
        double dano = getVida() - poderAtaque;
        return dano;

    }
}
