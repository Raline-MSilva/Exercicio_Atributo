package br.com.zup.aula2Metodos.Ex3;

public class Main {
    public static void main(String[] args) {
        Elevador edificio = new Elevador(15, 10);
        //edificio.plantaElevador();

        // entrando mais uma pessoa
        edificio.setEntra(8);
        System.out.println("Quantidade atual de passageiros: " + edificio.getQntPessoas());
        System.out.println("--------------");

        //saindo uma pessoa
        edificio.setSai(6);
        System.out.println("passageiros depois da saída: " + edificio.getQntPessoas());
        System.out.println("-------------");

        // subindo
        edificio.setSobe(8);
        System.out.println("------------------");

        // descendo
        edificio.setDesce(6);

        edificio.setSobe(1);

        System.out.println("------------------");


    }
}
