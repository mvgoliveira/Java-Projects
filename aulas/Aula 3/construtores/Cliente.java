package construtores;

public class Cliente {
  private String CPF;

  public Cliente (String cpf) {
    this.CPF = cpf;
  }

  public String getCPF() {
    return this.CPF;
  }
}
