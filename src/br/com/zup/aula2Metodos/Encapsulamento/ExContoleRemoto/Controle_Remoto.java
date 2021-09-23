package br.com.zup.aula2Metodos.Encapsulamento.ExContoleRemoto;

public class Controle_Remoto {
    Televisão tv;

    public Controle_Remoto () {

    }
    public Controle_Remoto (Televisão tv){
        this.tv = tv;
    }
    // criando métodos
    public void aumentarVolume() {
        int novoVolume = tv.getVolume() + 1;
        tv.setVolume(novoVolume);
    }

    public void diminuirVolume() {
        int novoVolume = tv.getVolume() - 1;
        tv.setVolume(novoVolume);
    }

    public void passarCanal() {
        int novoCanal = tv.getCanal() + 1;
        tv.setCanal(novoCanal);
    }

    public void voltarCanal() {
        int novoCanal = tv.getCanal() - 1;
        tv.setCanal(novoCanal);
    }
    public void trocarCanal(int mudarCanal) {
        tv.setCanal(mudarCanal);

    }
}
