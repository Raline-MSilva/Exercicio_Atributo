package br.com.zup.ClassesUniversidade;

public class Administradores extends Funcionarios{
    private String funcaoAdm;
    private String senoriedade;

    public Administradores() {

    }

    public Administradores(String nome, String cpf, String numeroRegistro, String orgaoLotacao, double salario, String funcaoAdm, String senoriedade) {
        super(nome, cpf, numeroRegistro, orgaoLotacao, salario);
        this.funcaoAdm = funcaoAdm;
        this.senoriedade = senoriedade;
    }

    public String getFuncaoAdm() {
        return funcaoAdm;
    }

    public void setFuncaoAdm(String funcaoAdm) {
        this.funcaoAdm = funcaoAdm;
    }

    public String getSenoriedade() {
        return senoriedade;
    }

    public void setSenoriedade(String senoriedade) {
        this.senoriedade = senoriedade;
    }

}
