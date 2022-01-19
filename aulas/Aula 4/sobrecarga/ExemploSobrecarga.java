package sobrecarga;

public class ExemploSobrecarga {
  private String nome;
  
  public void setNome(String nome) {
    this.nome = nome;
  }
  
  // Sobrecarga de construtores
  public ExemploSobrecarga(){}

  public ExemploSobrecarga(String nome){
    setNome(nome);
  }

  // Sobrecarga de métodos
  public int soma(int x, int y) {
    return x + y;
  }

  public int soma(int x, int y, int z) {
    return x + y + z;
  }

  public double soma(double x, double y) {
    return x + y;
  }

  public static void main(String[] args) {
    ExemploSobrecarga es = new ExemploSobrecarga();
    ExemploSobrecarga es2 = new ExemploSobrecarga("Marcus");

    System.out.println(es.soma(12, 20));
    System.out.println(es.soma(12, 20, 31));
    System.out.println(es.soma(12.5, 20.4));
    
    System.out.println(es.nome);
    System.out.println(es2.nome);
  }
}
