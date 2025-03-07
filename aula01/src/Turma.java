import java.util.ArrayList;
import java.util.List;

public class Turma {
    public int id;
    public String nome;
    public Professor professor;
    public List<Aluno> alunosMatriculados;

    public Turma() {
        this.alunosMatriculados = new ArrayList<>();
    }

    public void inserirAluno(Aluno aluno) {
        alunosMatriculados.add(aluno);
    }

    public void listarAlunos() {
        if (alunosMatriculados.isEmpty()) {
            System.out.println("Nenhum aluno matriculado.");
        } else {
            for (Aluno aluno : alunosMatriculados) {
                System.out.println(aluno.nome);
            }
        }
    }
}
