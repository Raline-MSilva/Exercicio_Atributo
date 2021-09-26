package br.com.zup.ClassesUniversidade;

public class Turma {
    private String anoTurma;
    private int notaTurma;
    private int numAlunos;

    public Turma() {
    }

    public Turma(String anoTurma, int notaTurma, int numAlunos) {
        this.anoTurma = anoTurma;
        this.notaTurma = notaTurma;
        this.numAlunos = numAlunos;
    }

    public String getAnoTurma() {
        return anoTurma;
    }

    public void setAnoTurma(String anoTurma) {
        this.anoTurma = anoTurma;
    }

    public int getNotaTurma() {
        return notaTurma;
    }

    public void setNotaTurma(int notaTurma) {
        this.notaTurma = notaTurma;
    }

    public int getNumAlunos() {
        return numAlunos;
    }

    public void setNumAlunos(int numAlunos) {
        this.numAlunos = numAlunos;
    }
}
