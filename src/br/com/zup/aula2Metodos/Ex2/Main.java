package br.com.zup.aula2Metodos.Ex2;

import br.com.zup.aula2Metodos.Ex2.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria cb = new ContaBancaria("12345",500, "Benedito");

        //mostrando dados da conta
        cb.extrato();
        System.out.println("-------------");

        //realizando um saque
        cb.saque(50);
        cb.extrato();
        System.out.println("--------------");

        //realizando um depósito
        cb.deposito(150);
        cb.extrato();
        System.out.println("------------");

    }

}
