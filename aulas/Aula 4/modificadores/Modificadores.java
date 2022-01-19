package modificadores;

public class Modificadores {
  protected String nome; // Pode ser acessível a partir de métodos encapsulados no mesmo package

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
}
