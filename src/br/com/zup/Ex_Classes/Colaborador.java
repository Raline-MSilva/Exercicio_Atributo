package br.com.zup.Ex_Classes;

public class Colaborador extends Pessoa{
    private int codigoSetor;
    private double salarioBase;
    private double imposto;

    public Colaborador() {

    }

    public Colaborador(String nome, String endereço, String telefone, int codigoSetor, double salarioBase, double imposto) {
        super(nome, endereço, telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    //Implemente a classe Colaborador com métodos seletores e modificadores e um método calcularSalario.
    public double calcularSalario(){
        return salarioBase - imposto;
    }
}
