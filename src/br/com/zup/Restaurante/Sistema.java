package br.com.zup.Restaurante;

import java.util.Scanner;

public class Sistema {

    private static Scanner capturarDados(String mensagem){
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    //opções
    public static void menu() {
        System.out.println("*** RESTAURANTE TEMPERO DE MAINHA ***");
        System.out.println("Digite 1 - Para cadastrar um prato.");
        System.out.println("Digite 3 - Para exibir o Cardápio.");
        System.out.println("Digite 4 - Para sair do Restaurante.");

    }
    //cadastrar pratos
    public static Prato cadastrarPrato(){
        String nome = capturarDados ("Digite o nome do prato: ").nextLine();
        double valor = capturarDados("Digite o valor do prato R$: ").nextDouble();
        Prato pratos = new Prato(nome, valor);
        return pratos;
    }
    public static Ingredientes cadastrarIngrediente(){
        String nome = capturarDados("Digite 1 Imgrediente que deseja: ").nextLine();
        Ingredientes ingrediente = new Ingredientes(nome);
        return ingrediente;
    }
    //executando as opções
    public static void Executar(){
        boolean menu = true;
        Restaurante restaurante = new Restaurante();

        while (menu){
            menu();
            int opcaoDesejada = capturarDados("Digite a opção que deseja: ").nextInt();

            if (opcaoDesejada == 1){
                Prato pratoNovo = cadastrarPrato();
                pratoNovo.addIngrediente(cadastrarIngrediente());
                System.out.println(pratoNovo);
            }
        }
    }
}
