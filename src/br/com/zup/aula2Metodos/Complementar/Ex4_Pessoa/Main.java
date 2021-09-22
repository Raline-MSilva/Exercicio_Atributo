package br.com.zup.aula2Metodos.Complementar.Ex4_Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa criatura = new Pessoa("Maria", 18, 62,1.55);

        //Envelhecer
        criatura.setEnvelhecer(2);
        System.out.println("Idade nova: " + criatura.getIdadeNova());
        System.out.println("---------------");

        //Engordar
        criatura.setEngordar(4);
        System.out.println("Peso novo: " + criatura.getPesoNovo());
        System.out.println("---------------");

        //Emagrecer
        criatura.setEmagrecer(9);
        System.out.println("Peso novo após emagrecer: " + criatura.getPesoNovo());
        System.out.println("-----------------");

        //Crescer
        criatura.setCrescer(0.2);
        System.out.println("Sua Altura é: " + criatura.getAlturaNova());

    }
}
