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
    private double area;
    private double perimetro;

    public double getLadoA(){
        return ladoA;
    }
    public double getLadoB(){
        return ladoB;
    }
    public double getArea(){
        return area;
    }
    public double getPerimetro(){
        return perimetro;
    }

    public Retangulo (double ladoA, double ladoB){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }
    //obtendo dois valores
    public void setMudarValorDosLados(double novoLadoA, double novoLadoB){
        ladoA = novoLadoA;
        ladoB = novoLadoB;
    }
    public void setRetornaLados(){
        System.out.println("LadoA: " + ladoA);
        System.out.println("LadoB: " + ladoB);
    }
    //calculos
    public void setCalcularArea(){
        area = ladoA * ladoB;
        System.out.println("Area: " + area);
    }
    public void setCalcularPerimetro(){
        perimetro = (ladoA * 2) + (ladoB * 2);
        System.out.println("Perímetro: " + perimetro);
    }
}
