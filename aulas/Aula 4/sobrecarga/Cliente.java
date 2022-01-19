package sobrecarga;

public class Cliente {
  private String cpf, nome, profissao;

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setProfissao(String profissao) {
    this.profissao = profissao;
  }

  public Cliente (String nome, String cpf) {
    setNome(nome);
    setCpf(cpf);  
  }

  public Cliente (String nome, String cpf, String profissao) {
    setNome(nome);
    setCpf(cpf);  
    setProfissao(profissao);
  }
}
