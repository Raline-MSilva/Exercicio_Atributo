package br.com.zup.aula2Metodos.heranca;

public class Rasteiros extends Inimigo {
    double danosEspinhos;

    public Rasteiros() {

    }

    public Rasteiros(String nome, double vida, double danosEspinhos) {
        super(nome, vida);
        this.danosEspinhos = danosEspinhos;
    }

    public double getDanosEspinhos() {
        return danosEspinhos;
    }

    public void setDanosEspinhos(double danosEspinhos) {
        this.danosEspinhos = danosEspinhos;
    }
    public double aplicarDano(){
        double dano = getVida() - danosEspinhos;
        return dano;
    }
}
