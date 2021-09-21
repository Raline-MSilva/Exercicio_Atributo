package br.com.zup.aula2Metodos.Complementar;
/*
Classe Quadrado: Crie uma classe que modele um quadrado:
1. Atributos: Tamanho do lado
2. Métodos: Mudar valor do Lado, Retornar valor do Lado e calcular
Área;
 */
public class Quadrado {
    double tamanhoLado;
    double area;

    public Quadrado(double tamanhoLado){
        this.tamanhoLado = tamanhoLado;
        this.area = area;
    }

    public void mudarValorLado(double valorLado){
        tamanhoLado = valorLado;
    }
    public void retornaValorLado (){
        System.out.println("Lado: " + tamanhoLado);
    }
    public void calcularArea(){
         area = tamanhoLado * tamanhoLado;
    }

}
