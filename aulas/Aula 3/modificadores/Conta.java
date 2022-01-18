package modificadores;

public class Conta {
  public String nomeCliente;
  private double saldo;

  public void sacar(double valor) {
    if ((saldo - valor) >= 0) {
      this.saldo = this.saldo - valor;
      System.out.println("Saque realizado. Novo saldo = " + this.saldo);
    } else {
      System.out.println("Saque NAO realizado. Saldo (" + this.saldo + ") menor que valor de saque");
    }
  }

  public void depositar(double valor) {
    this.saldo = this.saldo + valor;
    System.out.println("Saldo = " + this.saldo);
  }

  public void transferir(Conta destino, double valor) {
    sacar(valor);
    destino.depositar(valor);
  }

  public double getSaldo() {
    return this.saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }
}