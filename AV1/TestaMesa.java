import java.util.ArrayList;
import java.util.Scanner;

public class TestaMesa {
  public static void main(String[] args) {
    Mesa [] mesas = new Mesa[2];
    ArrayList<Mesa> listaDeMesas = new ArrayList<Mesa>();
    Scanner scanner = new Scanner(System.in);
    
    for (int i = 0; i < mesas.length; i++) {
      mesas[i] = new Mesa();

      System.out.println("Insira o código: ");
      mesas[i].setCodigo(scanner.nextLine());      
      
      System.out.println("Insira o valor: ");
      mesas[i].setValor(scanner.nextDouble()); 

      scanner.nextLine();

      listaDeMesas.add(mesas[i]);
    }
    
    scanner.close();

    System.out.println("média: " + calculaMediaPrecoMesas(listaDeMesas));
  }

  public static double calculaMediaPrecoMesas(ArrayList<Mesa> listaDeMesas){
    double soma = 0;

    for (int i = 0; i < listaDeMesas.size(); i++) {
      soma += listaDeMesas.get(i).getValor();
    }

    return soma/listaDeMesas.size();
  }
}
