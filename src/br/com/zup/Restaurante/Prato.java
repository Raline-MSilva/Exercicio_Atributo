package br.com.zup.Restaurante;

import java.util.ArrayList;
import java.util.List;

public class Prato {
    private String nome;
    private double valor;
    private List<Ingredientes> ingrediente = new ArrayList<>();

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

    public List<Ingredientes> getIngrediente() {
        return ingrediente;
    }
    public void addIngrediente(Ingredientes ingrediente){
        this.ingrediente.add(ingrediente);
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Nome do prato: " + nome);
        retorno.append("Valor: " + valor);
        retorno.append("Ingredientes: " + ingrediente);
        return retorno.toString();
    }
}
