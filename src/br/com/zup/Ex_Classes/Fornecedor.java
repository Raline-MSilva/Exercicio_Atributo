package br.com.zup.Ex_Classes;
/*
Considere, como subclasse da classe Pessoa (desenvolvida no item anterior) a classe Fornecedor.
 */
public class Fornecedor extends Pessoa{
    private double valorCredito;
    private double valorDivida;

    public Fornecedor() {

    }

    public Fornecedor(String nome, String endereço, String telefone, double valorCredito, double valorDivida) {
        super(nome, endereço, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }
    //método obterSaldo() que devolve a diferença entre os valores dos atributos valorCredito e valorDivida.
    public double obterSaldo(){
        double saldo = valorCredito - valorDivida;
        return saldo;
    }
}
