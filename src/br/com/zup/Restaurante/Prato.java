package br.com.zup.Restaurante;

import java.util.ArrayList;
import java.util.List;

public class Prato {
    private String nome;
    private double valor;
    private List<Ingrediente> ingrediente = new ArrayList<>();

    public Prato() {

    }

    public Prato(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
        this.ingrediente = ingrediente;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public List<Ingrediente> getIngrediente() {
        return ingrediente;
    }
    public void addIngrediente(Ingrediente ingrediente){
        this.ingrediente.add(ingrediente);
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\tNome do prato: " + nome);
        retorno.append("\tValor: " + valor);
        retorno.append("\tIngredientes: " + ingrediente);
        return retorno.toString();
    }
}
