package br.com.zup.aula2Metodos.Complementar.Ex3_Retangulo;

public class Main {
    public static void main(String[] args) {
        Retangulo reta = new Retangulo(6,2);

        reta.setMudarValorDosLados(3, 2);
        reta.setRetornaLados();
        System.out.println("--------------");

        //calculo area
        reta.setCalcularArea();
        System.out.println("--------------");

        //calculo perímetro
        reta.setCalcularPerimetro();
    }

}
