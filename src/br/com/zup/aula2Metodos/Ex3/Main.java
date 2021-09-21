package br.com.zup.aula2Metodos.Ex3;

public class Main {
    public static void main(String[] args) {
        Elevador edificio = new Elevador(15, 10);
        //edificio.plantaElevador();

        // entrando mais uma pessoa
        edificio.entra(10);
        System.out.println("Quantidade atual de passageiros: " + edificio.qntPessoas);
        System.out.println("--------------");

        //saindo uma pessoa
        edificio.sai(2);
        System.out.println("passageiros depois da saída: " + edificio.qntPessoas);
        System.out.println("-------------");

        // subindo
        edificio.sobe(8);
        System.out.println("Subindo pro: " + edificio.andarAtual);
        System.out.println("------------------");

        // descendo
        edificio.desce(0);
        System.out.println("Descendo pro: " + edificio.andarAtual);

    }
}
