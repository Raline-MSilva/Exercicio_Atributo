package br.com.zup.aula2Metodos.heranca;

public class Main {
    public static void main(String[] args) {
        Magos mago1 = new Magos("Picles", 500,100);
        Guerreiros eiros1 = new Guerreiros("Cactus", 400, 50);
        Rasteiros ras1 = new Rasteiros("Pano", 300, 55);
        Voadores voa1 = new Voadores("Vaso", 450, 70);

        mago1.exibirDados();
        //voa1 aplica dano em mago
        double dano = voa1.getTiroDano()
                ;
        //mago recebe dano e perde vidas
        mago1.receber(ras1.aplicarDano());
        mago1.receber(dano);
        System.out.println("Vida após os danos: ");
        mago1.exibirVida();
        System.out.println("---------------");

        ras1.receber(dano);
        mago1.aplicarMagia();
        System.out.println("Vida após os danos: ");
        ras1.exibirVida();





    }
}
