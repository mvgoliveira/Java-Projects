package modificadores;

import java.util.Scanner;
 
public class CaixaAutomatico {
  public static void main(String[] args) {
    Conta x = new Conta();
    x.nomeCliente = "Ana";
    x.setSaldo(15);

    System.out.println("Digite o valor do saque: ");
    Scanner s = new Scanner(System.in);
    double valor = s.nextDouble();

    x.sacar(valor);
  
    s.close();
  }
}
