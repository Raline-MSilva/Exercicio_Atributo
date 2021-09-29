package br.com.zup.Restaurante;

import java.util.ArrayList;
import java.util.List;

public class Cardápio {
    private List<Prato> pratos = new ArrayList<>();

    public Cardápio() {

    }

    public Cardápio(List<Prato> pratos) {
        this.pratos = pratos;
    }

    public List<Prato> getPratos() {
        return pratos;
    }
    public void addPrato(Prato pratos){
        this.pratos.add(pratos);
    }
    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Os pratos são:\n " + pratos);
        return retorno.toString();
    }
}
