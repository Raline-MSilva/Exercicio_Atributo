package br.com.zup.aula2Metodos.Encapsulamento;

public class Main {
    public static void main(String[] args) {
        Pessoa ser = new Pessoa("Joao", 1.55);
        //mostrando idade
        ser.setMostrarPessoa();
        ser.setCalculoIdade();
        System.out.println("--------------");
    }
}
