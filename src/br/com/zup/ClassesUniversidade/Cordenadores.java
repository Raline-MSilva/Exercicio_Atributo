package br.com.zup.ClassesUniversidade;

import java.util.ArrayList;
import java.util.List;

public class Cordenadores extends Funcionarios {
    //atributo
    private List<Professores> professoresSupervisionados = new ArrayList<>();

    public Cordenadores(String nome, String cpf, String numeroRegistro, String orgaoLotacao, double salario) {
        super(nome, cpf, numeroRegistro, orgaoLotacao, salario);
        this.professoresSupervisionados = professoresSupervisionados;
    }

    public void adicionarProfessor(Professores prof) {
        professoresSupervisionados.add(prof);
    }

    public void exibirProfessores() {
        for (Professores referencia : professoresSupervisionados) {
            System.out.println("Nome do Professor: " + referencia.getNome());
            System.out.println("Nivel senioridade: " + referencia.getNivelGraduacao());
            System.out.println("Disciplina Administrada: " + referencia.getDisciplinaMinistrada());
            System.out.println("Salario: " + getSalario());
        }
    }
    @Override
    public double aumentaSalario(){
        double salarioNovo = getSalario() * 0.1;
        return salarioNovo;
    }
}
