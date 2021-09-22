package br.com.zup.aula2Metodos.Complementar.Ex4_Pessoa;

/*
Classe Pessoa: Crie uma classe que modele uma pessoa:
1. Atributos: nome, idade, peso e altura
2. Métodos: Envelhecer, engordar, emagrecer, crescer. Obs: Por padrão,
a cada ano que nossa pessoa envelhece, sendo a idade dela menor
que 21 anos, ela deve crescer 0,5 cm.
 */
public class Pessoa {
    private String nome;
    private int idade;
    private double peso;
    private double altura;
    private double pesoNovo;
    private int idadeNova;
    private double alturaNova;

    public Pessoa() {

    }

    public Pessoa(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;

    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public double getPesoNovo() {
        return pesoNovo;
    }

    public int getIdadeNova() {
        return idadeNova;
    }

    public double getAlturaNova() {
        return alturaNova;
    }

    public void setEnvelhecer(int velhice) {
        idadeNova = idade + velhice;
    }

    public void setEngordar(double engordar) {
        pesoNovo = peso + engordar;
    }

    public void setEmagrecer(double magro) {
        pesoNovo = pesoNovo - magro;
    }
    //Obs: Por padrão,
    //a cada ano que nossa pessoa envelhece, sendo a idade dela menor
    //que 21 anos, ela deve crescer 0,5 cm.
    public void setCrescer(double crescer){
        if (idadeNova < 21){
            alturaNova = altura + 0.5;

            // sendo maior que 21 não cresce, continua com a altura atual.
        }else if(idadeNova > 21){
            alturaNova = altura;
            System.out.println("Permanece com a Altura atual!");
        }
    }
}