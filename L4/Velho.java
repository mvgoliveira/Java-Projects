public class Velho extends Imovel {
  public double getPreco() {
    return super.getPreco() - (super.getPreco() * 10)/100;
  }
}
