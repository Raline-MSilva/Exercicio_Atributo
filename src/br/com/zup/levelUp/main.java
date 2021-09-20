package br.com.zup.levelUp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    /*Crie uma classe que modele um país, contendo nome,
    extensão territorial e tamanho da população. No método main, crie uma lista
    chamada continente, onde teremos uma lista de países. Adicione 4 países na
    lista do continente (Países de sua escolha) e crie um menu para o usuário,
    que deverá decidir se vai listar os países do continente ou sair do programa.
     */

        //criando lista
        Scanner leitor = new Scanner(System.in);
        List <paises> continente = new ArrayList<>();

        paises pais1 = new paises("Bélgica", 30689, 1146);
        paises pais2 = new paises("Aústria", 83879, 8859);
        paises pais3 = new paises("Bulgária", 110912, 700000);
        paises pais4 = new paises("Albânia", 28748, 2862);

        continente.add(pais1);
        continente.add(pais2);
        continente.add(pais3);
        continente.add(pais4);

        //criando menu de opções
        boolean menu = true;
        while (menu){
            System.out.println("Por favor digite 1 para listar os países");
            System.out.println("Digite 2 para sair do menu");
            int opcao = leitor.nextInt();

            if (opcao == 1){
                for (paises referencia: continente){
                    System.out.println("O nome do país é: ");
                    System.out.println(referencia.nome);
                    System.out.println("A extensão territorial do País é: ");
                    System.out.println(referencia.extensao);
                    System.out.println("A população do país é: ");
                    System.out.println(referencia.populacao);
                }
            }
            //saindo do menu
            else if (opcao == 2){
                menu = false;
                System.out.println("Você saiu do menu");
            }
        }


    }
}
