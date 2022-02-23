public class TesteIgualdade2 {
  public static void main(String[] args) {
    Pessoa2 p1 = new Pessoa2();
    Pessoa2 p2 = new Pessoa2();
    Pessoa2 p3 = new Pessoa2();

    p1.setNome("Teste");
    p2.setNome("Teste");
    p3.setNome("Teste ".trim());
    
    //Sem reescrever o método equals
    System.out.println(p1.equals(p2)); //true (aponta para o mesmo objeto de memória). 
    
    System.out.println(p1.equals(p3)); //false (aponta para objetos diferentes de memória). 
    
    //reescrevendo o método equals
    System.out.println(p1.equals(p3)); //true (aponta para o mesmo objeto de memória). 
  
  
  }
}
