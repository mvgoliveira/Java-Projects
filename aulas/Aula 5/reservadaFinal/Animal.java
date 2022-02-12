package reservadaFinal;

public class Animal {
  private String nome;

  public static final boolean VIVO = true; // Isso é uma constante.

  public Animal() {}

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  // Nesse caso o método emitirSom será o metodo final na hierarquia, então toda 
  // classe que extender a classe animal não poderá sobrescrever o método emitirSom.
  public final void emitirSom() {
    System.out.println("Som genérico");
  }
}
