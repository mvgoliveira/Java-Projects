public class Conta {
  private double limite;
  private double saldo;

  public Conta() {}

  public Conta(double saldo, double limite) {
    setSaldo(saldo);
    setLimite(limite);
  }

  public double getLimite() {
    return limite;
  }

  public void setLimite(double limite) {
    this.limite = limite;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public boolean saca(double quantidade) {
    if (quantidade > this.saldo + this.limite) {
      System.out.println("Não permitido!");
      return false;
    } else {
      if (saldo - quantidade < 0) {
        this.saldo = this.saldo - quantidade;
        this.limite += this.saldo; 
        this.saldo = 0;
      } else {
        this.saldo = this.saldo - quantidade;
      }
    }
    
    return true;
  }
}
