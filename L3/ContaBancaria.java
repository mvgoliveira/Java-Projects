public class ContaBancaria {
  private double saldo;
  private Data dataAbertura;

  public ContaBancaria() {
    this.saldo = 0.0;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public Data getDataAbertura() {
    return dataAbertura;
  }

  public void setDataAbertura(Data dataAbertura) {
    this.dataAbertura = dataAbertura;
  }

  public String getDataAberturaFormatada() {
    return (
      dataAbertura.getDia() + "/" +
      dataAbertura.getMes() + "/" +
      dataAbertura.getAno()
    );
  }

  public String getSaldoFormatado() {
    return ("R$ " + getSaldo());
  }

  public void depositar(double valor) {
    this.saldo += valor;
  }
  
  public void sacar(double valor) {
    if (valor <= this.saldo) {
      this.saldo -= valor; 
    }
  }
}
