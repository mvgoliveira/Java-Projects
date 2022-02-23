public class Pessoa {
  private String nome;
  private int idade;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  @Override
  public String toString() {
    return nome;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }

    if (obj instanceof Pessoa) { // Só compara entre instancias de pessoas.
      Pessoa p = (Pessoa) obj;  
  
      if (this.getIdade() == p.getIdade()) {
        return true;
      } 
    }
    
    return false;
  }
}
