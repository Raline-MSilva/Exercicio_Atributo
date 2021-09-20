package br.com.zup.levelUp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    /*Crie uma classe que modele um país, contendo nome,
    extensão territorial e tamanho da população. No método main, crie uma lista
    chamada continente, onde teremos uma lista de países. Adicione 4 países na
    lista do continente (Países de sua escolha) e crie um menu para o usuário,
    que deverá decidir se vai listar os países do continente ou sair do programa.
     */

        Scanner leitor = new Scanner(System.in);
        Map<String, Double> continente = new HashMap<String, Double>();

        paises belgica = new paises("Bélgica", 30.689, 11.46);
        paises austria = new paises("Aústria", 83.879, 8.859);
        paises bulgaria = new paises("Bulgária", 110.912, 7.0);
        paises albania = new paises("Albânia", 28.748, 2.862);
    }
}
