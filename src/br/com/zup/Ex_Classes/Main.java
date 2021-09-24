package br.com.zup.Ex_Classes;

public class Main {
    public static void main(String[] args) {
        Pessoa ana = new Pessoa("Ana", "Palmares", "12345678");
        Fornecedor joao = new Fornecedor("Joao", "Recife", "987456123", 500,700);
        Colaborador pedro = new Colaborador("Pedro", "narnia","5897", 1254,1000,500);

        ana.getNome();
        System.out.println("Nome: " + ana.getNome());

        System.out.println("-------------------------");
        System.out.println("Nome: " + joao.getNome());
        System.out.println("Crédito: " + joao.getValorCredito());
        System.out.println("Dívida: " + joao.getValorDivida());
        System.out.println("Saldo: " + joao.obterSaldo());
        System.out.println("-------------------------");

        System.out.println("Nome: " + pedro.getNome());
        System.out.println("Salário Bruto: " + pedro.getSalarioBase());
        System.out.println("Salário Liquído: " + pedro.calcularSalario());


    }
}
