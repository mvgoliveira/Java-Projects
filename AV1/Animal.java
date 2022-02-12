public class Animal {
  private int idade;
  private String nome;

  public Animal() {}

  public int getIdade() {
    return idade;
  }
  
  public void setIdade(int idade) {
    this.idade = idade;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void emitirSom() {
    System.out.println("Som genérico");
  }

  public String toString() {
    return nome; 
  }
}
