package br.com.zup.aula2Metodos.Encapsulamento;
/*
Crie uma classe para representar uma pessoa, com os atributos privados de nome, data de nascimento e altura.
Crie os métodos públicos necessários para sets e gets e também um método para imprimir todos dados de uma pessoa.
Crie um método para calcular a idade da pessoa.
 */
public class Pessoa {
   private String nome;
   private int anoNascimento = 2010;
   private int anoAtual = 2021;
   private double altura;
   private int idade;

   public  Pessoa (String nome, double altura){
       this.nome = nome;
       this.altura = altura;

   }

   public String getNome(){
       return nome;
   }
   public int getAnoNascimento(){
       return anoNascimento;
   }
   public int getAnoAtual(){
       return anoAtual;
   }
   public double getAltura(){
       return altura;
   }
   public int getIdade(){
       return idade;
   }
   public void setMostrarPessoa(){
       System.out.println("Nome: " + nome);
       System.out.println("Ano nascimento: " + anoNascimento);
       System.out.println("Altura: " + altura);

    }
    public void setCalculoIdade(){
       idade = anoAtual - anoNascimento;
        System.out.println("Idade: " + idade);
    }

}
