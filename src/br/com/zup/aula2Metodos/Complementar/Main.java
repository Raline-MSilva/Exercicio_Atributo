package br.com.zup.aula2Metodos.Complementar;

public class Main {
    public static void main(String[] args) {
        Quadrado quadro = new Quadrado(4);

        quadro.retornaValorLado();
        //mudando o lado
        quadro.mudarValorLado(3);
        quadro.retornaValorLado();
        System.out.println("--------------");

        //calculo da area e exibição do mesmo
        quadro.calcularArea();
        System.out.println(quadro.area);

    }
}
