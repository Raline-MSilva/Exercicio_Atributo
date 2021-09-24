package br.com.zup.Ex_Classes;

public class Administrador extends Colaborador{
    private double ajudaDeCustos;

    public Administrador() {

    }

    public Administrador(String nome, String endereço, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCustos) {
        super(nome, endereço, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCustos = ajudaDeCustos;
    }

    public double getAjudaDeCustos() {
        return ajudaDeCustos;
    }

    public void setAjudaDeCustos(double ajudaDeCustos) {
        this.ajudaDeCustos = ajudaDeCustos;
    }
    @Override
    public double calcularSalario(){
        double salario = getSalarioBase() - getImposto() + ajudaDeCustos;
        return salario;
    }
}
