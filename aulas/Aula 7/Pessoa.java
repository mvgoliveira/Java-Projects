public class Pessoa {
  private String nome;
  private String cpf;
  private int idade;

  public Pessoa() {}

  public Pessoa (String cpf) {
    setCpf(cpf);
  }

  public Pessoa(String nome, String cpf) {
    setNome(nome);
    setCpf(cpf);
  }

  public Pessoa(String nome, String cpf, int idade) {
    setCpf(cpf);
    setIdade(idade);
    setNome(nome);
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  @Override
  public String toString() {
    return "[" + cpf + "-" + nome +"]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Pessoa other = (Pessoa) obj;
    if (cpf == null) {
      if (other.cpf != null)
        return false;
    } else if (!cpf.equals(other.cpf))
      return false;
    return true;
  }
}
