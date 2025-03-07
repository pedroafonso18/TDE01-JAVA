public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Xilberto";
        professor.email = "xubaibo@gmail.com";

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Junior";
        aluno1.email = "juniorkrai@gmail.com";

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Avunior";
        aluno2.email = "jgaeesuniorkrai@gmail.com";

        Turma turma = new Turma();
        turma.id = 1;
        turma.nome = "A";
        turma.professor = professor;

        turma.inserirAluno(aluno1);
        turma.inserirAluno(aluno2);

        System.out.println("Alunos matriculados na turma:");
        turma.listarAlunos();

        professor.message();
        aluno1.message();
    }
}
