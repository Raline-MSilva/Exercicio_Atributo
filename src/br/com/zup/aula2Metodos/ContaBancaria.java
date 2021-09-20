package br.com.zup.aula2Metodos;
/*Crie uma classe referente à uma conta bancária, que possui como atributos o seu
número, saldo e o nome do correntista. Crie também o método saque() que serve
para retirar o certo valor do saldo, o método depósito() que serve para adicionar um
valor ao saldo e o método extrato() que serve para mostrar na tela o nome do
correntista, o número da conta e o saldo. Crie um programa principal e demonstre a
utilização dos métodos implementados.
 */
public class ContaBancaria {
    String numConta;
    double saldo;
    String nomeCorrentista;

    public ContaBancaria (String numConta, double saldo, String nomeCorrentista){
        this.numConta = numConta;
        this.saldo = saldo;
        this.nomeCorrentista = nomeCorrentista;
    }

    public void conta (){
        System.out.println("Nome: " + nomeCorrentista);
        System.out.println("Número: " + numConta);
        System.out.println("Saldo: " + saldo);
    }
    public void saque (double solicitaSaque){
        saldo = saldo - solicitaSaque;
    }

}
