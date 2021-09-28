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
        return "Prato{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                ", ingrediente=" + ingrediente +
                '}';
    }
}
