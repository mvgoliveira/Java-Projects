public class Q7 {
  public static void main(String[] args) {
    double imposto = 1000.00, valorAPagar, ValorMulta, ValorJurosDia;

    int diasDeAtraso = 10;

    double percentagemMultaAtraso = 2.0, percentagemJurosDia = 0.1;

    valorAPagar = imposto;

    if (diasDeAtraso > 0) {
      ValorMulta = valorAPagar * (percentagemMultaAtraso) / 100;
      valorAPagar += ValorMulta;
      ValorJurosDia = imposto * (percentagemJurosDia) / 100;
      valorAPagar += ValorJurosDia * diasDeAtraso;

      System.out.println("Valor para pagar hoje: " + valorAPagar);

      for (int i = 1; i < 5; i++) {
        valorAPagar += ValorJurosDia;
        System.out.println("Valor para Pagar Hoje+" + i + ": " + valorAPagar);
      }
    }
  }
}
