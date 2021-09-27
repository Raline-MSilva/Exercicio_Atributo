package br.com.zup.Imobiliaria;

public class Main {
    public static void main(String[] args) {
        Imovel imovel1 = new Imovel("Bahia",800,"Pedro");
        Moradores morador1 = new Moradores("Raline", "125478");
        Moradores morador2 = new Moradores("Maria", "125478");

        //add moradores
        imovel1.addMorador(morador1);
        imovel1.addMorador(morador2);

        //add imovel
        System.out.println(imovel1);


    }
}
