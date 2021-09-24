package br.com.zup.Ex_Classes;

public class Main {
    public static void main(String[] args) {
        Pessoa ana = new Pessoa("Ana", "Palmares", "12345678");
        Fornecedor joao = new Fornecedor("Joao", "Recife", "987456123", 500,700);

        ana.getNome();
        System.out.println("Nome: " + ana.getNome());

        System.out.println("Nome: " + joao.getNome());
        System.out.println("Crédito: " + joao.getValorCredito());
        System.out.println("Dívida: " + joao.getValorDivida());
        System.out.println("Saldo: " + joao.obterSaldo());
        if (joao.obterSaldo() <= joao.getValorDivida()){
            System.out.println("Você está negativado");
        } else if (joao.obterSaldo() >= joao.getValorDivida()){
            System.out.println("Possui saldo");
        }

    }
}
