package br.com.zup.Ex_Classes;

public class Main {
    public static void main(String[] args) {
        Pessoa ana = new Pessoa("Ana", "Palmares", "12345678");
        Fornecedor joao = new Fornecedor("Joao", "Recife", "987456123", 500, 700);
        Colaborador pedro = new Colaborador("Pedro", "narnia", "5897", 1254, 1000, 500);
        Administrador adm = new Administrador("Marcos", "Disney", "456987", 5896, 1500, 400, 150);

        //Pessoa
        ana.getNome();
        System.out.println("Nome: " + ana.getNome());

        //Fornecedor
        System.out.println("-------------------------");
        System.out.println("Nome: " + joao.getNome());
        System.out.println("Crédito: " + joao.getValorCredito());
        System.out.println("Dívida: " + joao.getValorDivida());
        System.out.println("Saldo: " + joao.obterSaldo());
        System.out.println("-------------------------");

        //Colaborador
        System.out.println("Nome: " + pedro.getNome());
        System.out.println("Salário Bruto: " + pedro.getSalarioBase());
        System.out.println("Salário Liquído: " + pedro.calcularSalario());
        System.out.println("--------------------------");

        //Administrador
        System.out.println("Nome: " + adm.getNome());
        System.out.println("Salário Bruto: " + adm.getSalarioBase());
        System.out.println("Imposto: " + adm.getImposto());
        System.out.println("Ajuda de Custo: " + adm.getAjudaDeCustos());
        System.out.println("Salário liquido: " + adm.calcularSalario());


    }
}
