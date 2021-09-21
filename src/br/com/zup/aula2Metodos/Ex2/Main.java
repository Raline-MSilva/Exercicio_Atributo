package br.com.zup.aula2Metodos.Ex2;

import br.com.zup.aula2Metodos.Ex2.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria cb = new ContaBancaria("12345",500, "Benedito");

        //mostrando dados da conta
        cb.setExtrato();
        System.out.println("-------------");

        //realizando um saque
        cb.setSaque(50);
        cb.setExtrato();
        System.out.println("--------------");

        //realizando um depósito
        cb.setDeposito(150);
        cb.setExtrato();
        System.out.println("------------");

    }

}
