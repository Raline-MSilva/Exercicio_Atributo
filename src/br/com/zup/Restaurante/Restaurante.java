package br.com.zup.Restaurante;

import java.util.List;

public class Restaurante {
    private Cardápio cardapio = new Cardápio();

    public Restaurante() {

    }

    public Restaurante(Cardápio cardapio) {
        this.cardapio = cardapio;
    }

    public Cardápio getCardapio() {
        return cardapio;
    }

    public void setCardapio(Cardápio cardapio) {
        this.cardapio = cardapio;
    }

}
