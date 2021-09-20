package br.com.zup.listaAtributos;

import br.com.zup.listaAtributos.Bola;
import br.com.zup.listaAtributos.Carro;
import br.com.zup.listaAtributos.ContaCorrente;
import br.com.zup.listaAtributos.Pessoa;

public class Main {

    public static void main(String[] args) {
        /*Crie uma classe que modele uma bola, toda bola contém uma
        circunferência, cor, marca e velocidade. Após a modelagem, instancie objetos
        diferentes no método main para testes.
         */
        Bola futebol = new Bola();
        Bola volei = new Bola();

        futebol.circuferencia = 68;
        futebol.cor = "Amarela";
        futebol.marca = "Nike";
        futebol.velocidade = 35;

        volei.circuferencia = 10;
        volei.cor = "preta";
        volei.marca = "adidas";
        volei.velocidade = 25;

        System.out.println(futebol.marca);
        System.out.println(volei.marca);

        /*Crie uma classe que modele uma pessoa, toda pessoa
        contém nome, idade, peso e altura. No construtor, o peso é opcional, com
        valor default (padrão) zero e os demais atributos são obrigatórios.
        */
        Pessoa criatura = new Pessoa("Raline", 24, 1.55);
        criatura.peso = 62;

        System.out.println(criatura.nome);
        System.out.println(criatura.idade);


        /*Crie uma classe para construir uma conta corrente.
        A classe deve possuir os seguintes atributos: número da conta, nome do
        correntista e saldo. No construtor, o saldo é opcional, com valor default
        (padrão) zero e os demais atributos são obrigatórios.
         */

        ContaCorrente cc = new ContaCorrente(449685, "Benedito");

        System.out.println(cc.nome);
        System.out.println(cc.conta);

        /*Crie uma classe para modelar um carro. Todo carro tem
        quantidade de portas, modelo, marca e potência. No construtor, a potência é
        opcional, com valor default (padrão) 2.0 e os demais atributos são
        obrigatórios.
         */

        Carro obj_carro = new Carro();
        obj_carro.portas = 4;
        obj_carro.modelo = "SUV";
        obj_carro.marca = "Hyundai";

        System.out.println(obj_carro.marca);
        System.out.println(obj_carro.modelo);
    }
}
