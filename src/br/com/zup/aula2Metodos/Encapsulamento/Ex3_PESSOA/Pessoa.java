package br.com.zup.aula2Metodos.Encapsulamento.Ex3_PESSOA;
/*
Crie uma classe para representar uma pessoa, com os atributos privados de nome, data de nascimento e altura.
Crie os métodos públicos necessários para sets e gets e também um método para imprimir todos dados de uma pessoa.
Crie um método para calcular a idade da pessoa.
 */
public class Pessoa {
   private String nome;
   private Data dataDeNascimento;
   private double altura;

   public Pessoa (){

   }

   public Pessoa(String nome, Data dataDeNascimento, double altura) {
      this.nome = nome;
      this.dataDeNascimento = dataDeNascimento;
      this.altura = altura;
   }

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public Data getDataDeNascimento() {
      return dataDeNascimento;
   }

   public void setDataDeNascimento(Data dataDeNascimento) {
      this.dataDeNascimento = dataDeNascimento;
   }

   public double getAltura() {
      return altura;
   }

   public void setAltura(double altura) {
      this.altura = altura;
   }
   //dentro da minha classe tenho poder sobre os dados, não uso os gets e sets
   public void mostrarDados () {
      System.out.println("Nome da pessoa: " + nome);
      System.out.println("Data de Nascimento: " + dataDeNascimento.getDia() + "/" + dataDeNascimento.getMes() + "/" + dataDeNascimento.getAno());
      System.out.println("Altura: " + altura);
   }
}
