package br.com.zup.aula2Metodos.Complementar;
/*
Classe Bola: Crie uma chamada Jabulani
1. Atributos: Cor, circunferência, material
2. Métodos: trocaCor e mostraCor
 */
public class Bola {
    String cor;
    String circuferencia;
    String material;

    public Bola(String cor, String circuferencia, String material){
        this.cor = cor;
        this.circuferencia = circuferencia;
        this.material = material;
    }

    public void mostrarBola (){
        System.out.println("Cor da Bola: " + cor);
        System.out.println("Circuferência: " + circuferencia);
        System.out.println("Material: " + material);
    }

    public void trocarCor(String corNova){
        cor = corNova;
    }
}
