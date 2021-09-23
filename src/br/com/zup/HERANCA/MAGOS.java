package br.com.zup.HERANCA;


public class Magos extends HEROI {
    private double poderMagico;
    private double aplicarMagia;

    public Magos(String nome, double vida, double poderMagico, double aplicarMagia) {
        super(nome, vida);
        this.poderMagico = poderMagico;
        this.aplicarMagia = aplicarMagia;
    }

    public double getPoderMagico() {
        return poderMagico;
    }

    public void setPoderMagico(double poderMagico) {
        this.poderMagico = poderMagico;
    }

    public double getAplicarMagia() {
        return aplicarMagia;
    }
}
