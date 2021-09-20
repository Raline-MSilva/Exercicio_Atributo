package br.com.zup.aula2Metodos.Ex3;

/*Crie uma classe denominada Elevador para armazenar as informações de um
elevador dentro de um prédio. A classe deve armazenar o andar atual (térreo = 0),
total de andares no prédio (desconsiderando o térreo), capacidade do elevador e
quantas pessoas estão presentes nele.



- Desce : para descer um andar (não deve descer se já estiver no térreo);
 */
public class Elevador {
    int terreo = 0;
    int andares;
    double capacidade;
    int qntPessoas;

    public Elevador(int andares, double capacidade) {
        this.terreo = terreo;
        this.andares = andares;
        this.capacidade = capacidade;
        this.qntPessoas = qntPessoas;

    }

    public void plantaElevador() {
        System.out.println("--Elevador--");
        System.out.println("Terreo: " + terreo);
        System.out.println("Quantidade de andares: " + andares);
        System.out.println("Capacidade de: " + capacidade);
        System.out.println("Limite de Passageiros: " + qntPessoas);

    }

    //Entra : para acrescentar uma pessoa no elevador (só deve acrescentar se ainda
    //houver espaço);
    public void entra(int novaPessoa) {
        if (novaPessoa <= capacidade) {
            qntPessoas = qntPessoas + novaPessoa;
        } else {
            System.out.println("Ops, chegamos no limite");
        }
    }

    //- Sai : para remover uma pessoa do elevador (só deve remover se houver alguém
    //dentro dele);
    public void sai(int saiPessoa) {
        if (saiPessoa > 0 & saiPessoa <= capacidade) {
            qntPessoas = qntPessoas - saiPessoa;
        } else {
            System.out.println("Fica pessoa");
        }

    }
    public void sobe (int subir){
        if (subir < andares){
            terreo = terreo + subir;
        }else {
            System.out.println("Nao tem pra onde subir");
        }
    }
    public void desce (int descer){
        if (descer > terreo & descer < andares){
            terreo = descer;
        }else {
            System.out.println("não desce mais, já estamos no terreo");
        }
    }


}
