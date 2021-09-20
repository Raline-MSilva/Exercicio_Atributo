package br.com.zup.aula2Metodos.Ex3;
/*Crie uma classe denominada Elevador para armazenar as informações de um
elevador dentro de um prédio. A classe deve armazenar o andar atual (térreo = 0),
total de andares no prédio (desconsiderando o térreo), capacidade do elevador e
quantas pessoas estão presentes nele.
Entra : para acrescentar uma pessoa no elevador (só deve acrescentar se ainda
houver espaço);


- Desce : para descer um andar (não deve descer se já estiver no térreo);
 */
public class Elevador {
    int terreo = 0;
    int andares = 15;
    double capacidade = 10;
    int qntPessoas = 5;

    public Elevador(int terreo, int andares, double capacidade, int qntPessoas){
        this.terreo = terreo;
        this.andares = andares;
        this.capacidade = capacidade;
        this.qntPessoas = qntPessoas;

    }

    public void plantaElevador(){
        System.out.println("--Elevador--");
        System.out.println("Terreo: " + terreo);
        System.out.println("Quantidade de andares: " + andares);
        System.out.println("Capacidade de: " + capacidade);
        System.out.println("Limite de Passageiros: " + qntPessoas);

    }
    public void entra (int novaPessoa){
        if (novaPessoa < capacidade){
            System.out.println("Entra uma pessoa");
        }else {
            System.out.println("Ops, chegamos no limite");
        }
    }
    //- Sai : para remover uma pessoa do elevador (só deve remover se houver alguém
    //dentro dele);
    public void sai (int saiPessoa){
        if (saiPessoa > capacidade){
            System.out.println("Sai uma pessoa");
        } else {
            System.out.println("Fica pessoa");
        }
    }
    //- Sobe : para subir um andar (não deve subir se já estiver no último andar);
    public void sobe (int subir){
        if (subir == andares){
            System.out.println("Estamos no último andar!");
        }else {
            System.out.println("Sobe");
        }
    }
    //- Desce : para descer um andar (não deve descer se já estiver no térreo);
    public void desce (int descer){
        if (descer == terreo){
            System.out.println("Estamos no terreo!");
        } else {
            System.out.println("Desce");
        }

    }



}
