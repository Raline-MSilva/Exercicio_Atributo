package br.com.zup.aula2Metodos.Ex4;

public class Main {
    public static void main(String[] args) {
        CartaoCredito cartao = new CartaoCredito(500,200,"João Pedro");

        cartao.aumentaLimite(2000);
        System.out.println("Seu novo limite é R$: " + cartao.limite);
        System.out.println("-------------");

        cartao.diminuiLimite(100);
        System.out.println("Limite diminuído para R$: " + cartao.limite);
        System.out.println("---------------");

        cartao.realizaCompra(1000);
        System.out.println("Novo limite após compra R$: " + cartao.limite);
        System.out.println("--------------");

        System.out.println("Extrato do seu cartão");
        cartao.extratoFatura();
    }
}
