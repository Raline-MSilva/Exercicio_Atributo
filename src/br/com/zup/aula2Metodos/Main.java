package br.com.zup.aula2Metodos;

public class Main {
    public static void main(String[] args) {
        Carro veiculo = new Carro("Celta", 890, "Chevrolet", "Preto", 10000);
        veiculo.fichaTecnica();

        //dando desconto
        veiculo.Dardesconto(2000);
        System.out.println("-------------------");
        veiculo.fichaTecnica();

        // mudando a cor do carro
        System.out.println("------------------");
        veiculo.pintar("Vermelho");
        veiculo.fichaTecnica();
    }
}
