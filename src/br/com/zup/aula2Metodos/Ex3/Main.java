package br.com.zup.aula2Metodos.Ex3;

public class Main {
    public static void main(String[] args) {
        Elevador edificio = new Elevador(0,15, 10,5);
        edificio.plantaElevador();

        // entrando mais uma pessoa
        edificio.entra(2);

        //saindo uma pessoa
        edificio.sai(12);

        //subindo
        edificio.sobe(2);

        //descendo
        edificio.desce(3);


    }
}
