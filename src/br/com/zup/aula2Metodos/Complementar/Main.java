package br.com.zup.aula2Metodos.Complementar;

public class Main {
    public static void main(String[] args) {
        Bola jabulani = new Bola("Verde", "Redonda", "Couro");

        //mostrando a bola
        jabulani.mostrarCor();
        System.out.println("--------------");

        //mudando a cor da bola
        jabulani.trocarCor("Azul");
        jabulani.mostrarCor();
    }
}
