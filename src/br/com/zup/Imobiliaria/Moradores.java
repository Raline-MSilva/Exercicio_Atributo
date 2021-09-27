package br.com.zup.Imobiliaria;

public class Moradores {
    private String nome;
    private String cpf;

    public Moradores() {

    }

    public Moradores(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString(){
        StringBuilder retorno = new StringBuilder();
        retorno.append("Nome: " + nome);
        retorno.append("\tCPF: " + cpf);
        return retorno.toString();
    }
}
