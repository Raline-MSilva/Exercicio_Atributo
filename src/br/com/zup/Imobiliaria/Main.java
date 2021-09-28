package br.com.zup.Imobiliaria;

public class Main {
    public static void main(String[] args) {
        Imovel imovel1 = new Imovel("Bahia",800,"Pedro");
        Imovel imovel2 = new Imovel("Recife", 500, "Joao");
        Moradores morador1 = new Moradores("Raline", "125478");
        Moradores morador2 = new Moradores("Maria", "125478");

        //add moradores
        imovel1.addMorador(morador1);
        imovel1.addMorador(morador2);

        //add imovel
        System.out.println(imovel1);

        //lista imoveis
        Imobiliaria imobiliaria = new Imobiliaria();
        imobiliaria.addImovel(imovel1);
        imobiliaria.addImovel(imovel2);
        System.out.println(imobiliaria.getImovels());



    }
}
