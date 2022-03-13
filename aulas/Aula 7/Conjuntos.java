import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Conjuntos {
  public static void main(String[] args) {
    ArrayList<String> lista = new ArrayList<String>();

    lista.add("casa");
    lista.add("casa");
    lista.add("bola");

    System.out.println(lista); // Imprime "casa" duas vezes
    
    // Conjunto não permite elementos duplicados.
    
    Set<String> conjunto = new HashSet<String>();
    boolean c1 = conjunto.add("casa"); // Retorna um boolean dizendo se conseguiu inserir ou não.
    boolean c2 = conjunto.add("casa");
    conjunto.add("bola");
    System.out.println(c1); // Imprime true
    System.out.println(c2); // Imprime false
    System.out.println(conjunto); // Imprime "casa" uma vez

    ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();

    Pessoa p1 = new Pessoa("Arnaldo", "123");
    Pessoa p2 = new Pessoa("Suzana", "456");
    Pessoa p3 = new Pessoa("Arnaldo", "123");
    
    listaPessoas.add(p1);
    listaPessoas.add(p2);
    listaPessoas.add(p3);
    
    System.out.println(listaPessoas); // Imprime o Arnaldo 2 vezes
    
    Set<Pessoa> conjuntoPessoas = new HashSet<Pessoa>();
    
    conjuntoPessoas.add(p1);
    conjuntoPessoas.add(p2);
    conjuntoPessoas.add(p3);
    
    System.out.println(conjuntoPessoas); // Imprime Arnaldo 2 vezes caso tenha o hashcode na classe Pessoa.
  
    HashSet k1 = getPessoasBD();
    Set k2 = getPessoasBD2();
  }
  
  public static HashSet getPessoasBD() { // Não é a maneira correta de fazer.
    HashSet<Pessoa> conjuntoPessoas = new HashSet<Pessoa>();
    
    Pessoa p1 = new Pessoa("Arnaldo", "123");
    Pessoa p2 = new Pessoa("Arnaldo", "123");
    
    conjuntoPessoas.add(p1);
    conjuntoPessoas.add(p2);
    
    return conjuntoPessoas;
  }
  
  public static Set<Pessoa> getPessoasBD2() { // É a maneira correta de fazer.
    HashSet<Pessoa> conjuntoPessoas = new HashSet<Pessoa>();
    
    Pessoa p1 = new Pessoa("Arnaldo", "123");
    Pessoa p2 = new Pessoa("Arnaldo", "123");
    
    conjuntoPessoas.add(p1);
    conjuntoPessoas.add(p2);
    
    return conjuntoPessoas;
  }
}
