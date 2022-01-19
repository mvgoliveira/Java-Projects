package polimorfismo;

public class Animal {
  private String nome, cor;
  private int idade;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public void emitirSom() {
    System.out.println("Som - animal 2022");
  }

  @Override 
  public String toString() { // Sobrescrita de métodos de Object
    return getNome();
  }
}

