package br.com.zup.aula2Metodos.Complementar;

public class Main {
    public static void main(String[] args) {
        Quadrado quadro = new Quadrado(4,2);

        quadro.mostrarQuadrado();
        //mudando o lado
        quadro.mudarValorLado(3);
        quadro.mostrarQuadrado();
    }
}
