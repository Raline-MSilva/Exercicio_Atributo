package br.com.zup.Imobiliaria;

import java.util.ArrayList;
import java.util.List;

public class Imovel {
    private String endereco;
    private double aluguelImovel;
    private String responsavelImovel;
    private List<Moradores> morador = new ArrayList<>();

    public Imovel() {

    }

    public Imovel(String endereco, double aluguelImovel, String responsavelImovel) {
        this.endereco = endereco;
        this.aluguelImovel = aluguelImovel;
        this.responsavelImovel = responsavelImovel;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setLocalizacao(String localizacao) {
        this.endereco = endereco;
    }

    public double getAluguelImovel() {
        return aluguelImovel;
    }

    public void setAluguelImovel(double aluguelImovel) {
        this.aluguelImovel = aluguelImovel;
    }

    public String getResponsavelImovel() {
        return responsavelImovel;
    }

    public void setResponsavelImovel(String responsavelImovel) {
        this.responsavelImovel = responsavelImovel;
    }

    public List<Moradores> getMorador() {
        return morador;
    }

    public void addMorador(Moradores morador){
        this.morador.add(morador);
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Localização: " + endereco + ".");
        retorno.append("\t Aluguel: " + aluguelImovel + ".");
        retorno.append("\t Responsável: " + responsavelImovel + ".");
        retorno.append("\t Moradores: " +morador + ".");
        return retorno.toString();
    }
}
