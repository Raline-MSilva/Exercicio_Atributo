package br.com.zup.ClassesUniversidade;

public class Main {
    public static void main(String[] args) {
        Cordenadores cord = new Cordenadores("Pedro", "145236", "2587","direita",14587);
        Professores prof1 = new Professores("Maria", "457896", "45879", "direita", 1254789,"Bacharel", "Java", 25, 3);
        cord.adicionarProfessor(prof1);
        cord.exibirProfessores();

    }
}
