package br.com.zup.Imobiliaria;

import java.util.ArrayList;
import java.util.List;

public class Imobiliaria {
    private List<Imovel> imovels = new ArrayList<>();

    public Imobiliaria() {

    }

    public Imobiliaria(List<Imovel> imovels) {
        this.imovels = imovels;
    }

    public List<Imovel> getImovels() {
        return imovels;
    }

    public void setImovels(List<Imovel> imovels) {
        this.imovels = imovels;
    }

    public void addImovel(Imovel imovel){
        this.imovels.add(imovel);
    }
}
