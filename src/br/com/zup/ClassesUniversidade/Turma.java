package br.com.zup.ClassesUniversidade;

public class Turma {
    private String anoTurma;
    private String notaTurma;
    private String numAlunos;

    public Turma() {
    }

    public Turma(String anoTurma, String notaTurma, String numAlunos) {
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

    public String getNotaTurma() {
        return notaTurma;
    }

    public void setNotaTurma(String notaTurma) {
        this.notaTurma = notaTurma;
    }

    public String getNumAlunos() {
        return numAlunos;
    }

    public void setNumAlunos(String numAlunos) {
        this.numAlunos = numAlunos;
    }
}
