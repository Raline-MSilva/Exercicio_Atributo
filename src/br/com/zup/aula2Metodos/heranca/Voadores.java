package br.com.zup.aula2Metodos.heranca;

public class Voadores extends Inimigo {
    private double tiroDano;

    public Voadores() {

    }

    public Voadores(String nome, double vida, double tiroDano) {
        super(nome, vida);
        this.tiroDano = tiroDano;
    }

    public double getTiroDano() {
        return tiroDano;
    }

    public void setTiroDano(double tiroDano) {
        this.tiroDano = tiroDano;
    }
    public double aplicarDano() {
        double dano = getVida() - tiroDano;
        return dano;
    }
}
