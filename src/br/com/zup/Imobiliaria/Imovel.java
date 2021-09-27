package br.com.zup.Imobiliaria;

public class Imovel {
    private String endereco;
    private double aluguelImovel;
    private String responsavelImovel;

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

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Localização: " + endereco);
        retorno.append("Aluguel: " + aluguelImovel);
        retorno.append("Responsável: " + responsavelImovel);
        return retorno.toString();
    }
}
