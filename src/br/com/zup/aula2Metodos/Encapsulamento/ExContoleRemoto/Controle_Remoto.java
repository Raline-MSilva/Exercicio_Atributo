package br.com.zup.aula2Metodos.Encapsulamento.ExContoleRemoto;

public class Controle_Remoto {
    Televisão tv;

    public Controle_Remoto () {

    }
    public Controle_Remoto (Televisão tv){
        this.tv = tv;
    }
    public void aumentarVolume() {
        int novoVolume = tv.getVolume() + 1;
        tv.setVolume(novoVolume);
    }

    public void diminuirVolume() {
        int novoVolume = tv.getVolume() - 1;
        tv.setVolume(novoVolume);
    }

    public void trocarCanal(int canal) {
        canal = canal + 1;
    }

    public void voltarCanal(int canal) {
        canal = canal - 1;
    }
}
