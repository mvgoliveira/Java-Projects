package sobrecarga;

public class ClientePf extends Cliente {
  public ClientePf (String nome, String cpf, String profissao) {
    super(nome, cpf, profissao); // Passando os parametro para a super classe Cliente.
  }

  public ClientePf (String nome, String cpf) {
    this(nome, cpf, null); // Passando parametros para o construtor acima.
  }
}
