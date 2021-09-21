package br.com.zup.aula2Metodos.Ex4;
/*Crie uma classe que represente um cartão de crédito, que deve ter como
atributos o seu limite, o saldo da fatura e nome do cliente. Crie também os métodos
aumentaLimite(), diminuiLimite(), realizaCompra() que não deve permitir uma
compra caso o limite tenha sido atingido e o imprimeFatura() que imprime na tela o
valor da fatura.
 */
public class CartaoCredito {
    double limite;
    double saldoFatura;
    String nomeCliente;

    public CartaoCredito (double limite, double saldoFatura, String nomeCliente) {
        this.limite = limite;
        this.saldoFatura = saldoFatura;
        this.nomeCliente = nomeCliente;
    }
    public void aumentaLimite (double maisLimite){
        limite = maisLimite;

    }
    public void diminuiLimite (double menosLimite){
        limite = limite - menosLimite;
    }
    public void realizaCompra( double novaCompra){
        if (novaCompra <= limite) {
            limite = limite - novaCompra;
            saldoFatura = saldoFatura + novaCompra;
        } else {
            System.out.println("Limite insuficiente!");
        }
    }
    public void fatura (double extratoFatura){
        System.out.println("Seu limite no momento é R$: " + limite);
        System.out.println("Sua fatura é R$: " + saldoFatura);
    }

}
