import java.io.FileInputStream;

public class Exceções {
  public static void main(String[] args) {

    // Aqui executa o método 2
    System.out.println("MAIN");
    metodo1();
    metodo2();
    
    System.out.println("-----------------------------------");

    try { // Aqui não executa o método 2
      System.out.println("MAIN");
      metodo3();
      metodo2();
      System.out.println("FIM DA MAIN");
    } catch (Exception e) {
      System.out.println("ERROR: " + e);
    }
    
    try { // Erro de compilação (Não compila). 
      // metodo4(); 
    } catch (Exception e) {
      System.out.println("ERROR: " + e);
    }
    
    try {
      metodo5();
    } catch (Exception e) {
      System.out.println("ERROR: " + e.getMessage());
    }
  }
  
  public static void metodo1() {
    int [] array = new int[10];
    
    try {
      for (int i = 0; i < 15; i++) {
        array[i] = i;
      }  
      System.out.println("METODO 1");
    } catch (Exception e) {
      System.out.println("ERROR: " + e);
    }
  }
  
  public static void metodo2() {
    System.out.println("METODO 2");
  }
  
  public static void metodo3() {
    Conta c = null;
    System.out.println(c.getSaldo());
  }

  // public static void metodo4() {
  //   new FileInputStream("arquivo.txt");
  // }

  public static void metodo5() {
    throw new Error("Erro lançado");
  }
}