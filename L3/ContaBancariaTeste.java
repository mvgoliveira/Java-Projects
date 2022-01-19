public class ContaBancariaTeste {
  public static void main(String[] args) {
    Data data = new Data();
    ContaBancaria conta = new ContaBancaria();

    data.setDia(19);
    data.setMes(01);
    data.setAno(2022);

    conta.setDataAbertura(data);
    
    System.out.println(conta.getDataAberturaFormatada());
    
    conta.depositar(52);
    System.out.println(conta.getSaldo());
    
    conta.sacar(50);
    System.out.println(conta.getSaldo());
  }
}
