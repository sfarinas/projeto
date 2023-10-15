package udemy2.composicao;

public class CursoTeste {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Joao");
        Aluno aluno2 = new Aluno("Salomao");
        Aluno aluno3 = new Aluno("Pedro");
        Aluno aluno4 = new Aluno("Jesus");
        Aluno aluno5 = new Aluno("Maria");


        Curso curso1 = new Curso("Java Completo");
        Curso curso2 = new Curso("Web 2023");
        Curso curso3 = new Curso("Android");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);

        curso2.adicionarAluno(aluno3);
        curso2.adicionarAluno(aluno4);

        curso3.adicionarAluno(aluno1);
        curso3.adicionarAluno(aluno2);
        curso3.adicionarAluno(aluno3);
        curso3.adicionarAluno(aluno4);

        aluno5.adicionarCurso(curso3);
        aluno5.adicionarCurso(curso2);

        for (Aluno aluno: curso1.alunos){
            System.out.println("Aluno " + aluno.nome + " matriculado no curso " + curso1.nome);
        }
        System.out.println();
        for (Aluno aluno: curso2.alunos){
            System.out.println("Aluno " + aluno.nome + " matriculado no curso " + curso2.nome);
        }
        System.out.println();
        for (Aluno aluno: curso3.alunos){
            System.out.println("Aluno " + aluno.nome + " matriculado no curso " + curso3.nome);
        }
        System.out.println();

        System.out.println(aluno1.cursos.get(0).alunos);
    }
}
