public class TesteIgualdade {
  public static void main(String[] args) {
    String str1 = "casa";
    String str2 = "casa ".trim();
    String str3 = "casa";

    System.out.println("["+ str1 +"]"); //"casa"
    System.out.println("["+ str2 +"]"); //"casa"
    System.out.println(str1 == str2); //False (str1 não se refere ao mesmo objeto que str2 em memória). 
    System.out.println(str1 == str3); //True
    
    System.out.println(str1.equals(str2)); //True (str1 é a msm string que str2)

    Pessoa p1 = new Pessoa();
    Pessoa p2 = new Pessoa();
    Pessoa p3 = p1;

    p1.setIdade(18);
    p2.setIdade(18);

    System.out.println(p1 == p2); //False (p1 não se refere ao mesmo objeto que p2). 
    System.out.println(p1 == p3); //True (p1 não se refere ao mesmo objeto que p3). 
    
    //Sem sobrescrever o método equals
    System.out.println(p1.equals(p2)); //false (as duas referências não são iguais). 
    
    //Sobrescrevendo o método equals
    System.out.println(p1.equals(p2)); //true (as duas idades são iguais). 

  }
}
