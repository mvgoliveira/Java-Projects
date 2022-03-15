public class Cachorro implements Comparable<Cachorro> {
  private String nome;
  private int idade;
  private double peso;

  public Cachorro () {}
  
  public Cachorro (String nome, int idade, double peso) {
    setNome(nome);
    setIdade(idade);
    setPeso(peso);
  }

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

  public double getPeso() {
    return peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  @Override
  public String toString() {
    return nome + " - " + idade + " - " + peso + "kg"; 
  }

  public int compareTo(Cachorro c) {
    return String.valueOf(idade).compareTo(String.valueOf(c.idade));
  }
}
