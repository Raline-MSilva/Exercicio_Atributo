package br.com.zup.aula2Metodos.Encapsulamento.ExContoleRemoto;

public class Main {
    public static void main(String[] args) {
        Televisão tv = new Televisão(6,5);
        Controle_Remoto cr = new Controle_Remoto(tv);

        cr.aumentarVolume();
        cr.diminuirVolume();
        System.out.println("Volume: " + tv.getVolume());

    }
}
