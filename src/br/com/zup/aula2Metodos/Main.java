package br.com.zup.aula2Metodos;

public class Main {
    public static void main(String[] args) {
        ContaBancaria cb = new ContaBancaria("12345",500, "Benedito");

        //mostrando dados da conta
        cb.conta();
        System.out.println("-------------");

        //realizando um saque
        cb.saque(50);
        cb.conta();
        System.out.println("---------");

    }

}
