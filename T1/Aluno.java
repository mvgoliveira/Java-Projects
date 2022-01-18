public class Aluno {
  private String nome;
  private double nota1, nota2;

  public Aluno(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return this.nome;
  }

  public double getNota1() {
    return this.nota1;
  }

  public void setNota1(double nota) {
    if (nota > 10) {
      this.nota1 = 10;
    } else if (nota < 0) {
      this.nota1 = 0;
    } else {
      this.nota1 = nota;
    }
  }

  public double getNota2() {
    return this.nota2;
  }
  
  public void setNota2(double nota) {
    if (nota > 10) {
      this.nota2 = 10;
    } else if (nota < 0) {
      this.nota2 = 0;
    } else {
      this.nota2 = nota;
    }
  }

  public double Media() {
    return (nota1 + nota2)/2;
  }

  public String Resultado() {
    if (Media() < 4) {
      return ("Reprovado");
    } else if(Media() >= 4 && Media() < 6) {
      return ("Em Recuperação");
    } else {
      return ("Aprovado");
    }
  }
}
