import java.util.Scanner;

public class Corretora {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Imovel[] imoveis = new Imovel[5];

    for (int i = 0; i < imoveis.length; i++) {
      imoveis[i] = new Imovel();
      
      System.out.println("insira o endereco: ");
      imoveis[i].setEndereco(scanner.nextLine());

      System.out.println("Insira o preco: ");
      imoveis[i].setPreco(scanner.nextInt());

      scanner.nextLine();
    }

    System.out.println(SomaPrecos(imoveis));

    scanner.close();
  }

  public static double SomaPrecos(Imovel[] imoveis) {
    double somaPrecos = 0;
    
    for (int i = 0; i < imoveis.length; i++) {
      somaPrecos += imoveis[i].getPreco();
    }
    
    return somaPrecos;
  }
}
