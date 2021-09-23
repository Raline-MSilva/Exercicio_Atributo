package br.com.zup.aula2Metodos.Encapsulamento.Ex3_PESSOA;

public class Main {
    public static void main(String[] args) {
        Pessoa ser = new Pessoa("Joao", 1.55);
        //mostrando idade
        ser.setMostrarPessoa();
        ser.setCalculoIdade();
        System.out.println("--------------");
    }
}
