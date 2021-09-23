package br.com.zup.aula2Metodos.Encapsulamento.Ex3_PESSOA;

public class Main {
    public static void main(String[] args) {
        Pessoa criatura = new Pessoa();
        Data dt = new Data(20, 12, 1998);

        criatura.setNome("Maria");
        criatura.setAltura(1.55);
        //exibindo data
        criatura.setDataDeNascimento(dt);
        criatura.mostrarDados();
        System.out.println("--------------");
    }
}
