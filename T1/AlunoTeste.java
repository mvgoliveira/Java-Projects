public class AlunoTeste {
  public static void main(String[] args) {
    Aluno aluno = new Aluno("Marcus");

    aluno.setNota1(152);
    aluno.setNota2(9);

    System.out.println(aluno.Media());
    System.out.println(aluno.Resultado());
  }
}
