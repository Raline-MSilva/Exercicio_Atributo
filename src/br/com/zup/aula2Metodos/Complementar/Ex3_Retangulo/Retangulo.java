package br.com.zup.aula2Metodos.Complementar.Ex3_Retangulo;
/*
Classe Retangulo: Crie uma classe que modele um retângulo:
1. Atributos: LadoA, LadoB (ou Comprimento e Largura, ou Base e
Altura, a escolher)
2. Métodos: Mudar valor dos lados, Retornar valor dos lados, calcular
Área e calcular Perímetro;
 */
public class Retangulo {
    private double ladoA;
    private double ladoB;

    public double getLadoA(){
        return ladoA;
    }
    public double getLadoB(){
        return ladoB;
    }

    public Retangulo (double ladoA, double ladoB){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }
    public void setMudarValorDosLados(double novosLados){
        ladoA = novosLados;
        ladoB = novosLados;
    }
    public void setRetornaLados(){
        System.out.println("LadoA: " + ladoA);
        System.out.println("LadoB: " + ladoB);
    }
}
