import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorTeste {
  public static void main(String[] args) {
    Set<Pessoa> conjuntoPessoas = new HashSet<Pessoa>();

    Pessoa p1 = new Pessoa("Arnaldo", "123", 1);
    Pessoa p2 = new Pessoa("Suzana", "456", 2);
    Pessoa p3 = new Pessoa("Arnaldo", "123", 3);
    
    conjuntoPessoas.add(p1);
    conjuntoPessoas.add(p2);
    conjuntoPessoas.add(p3);
    
    System.out.println(conjuntoPessoas);

    // Conjuntos não tem o método Get
    Iterator it = conjuntoPessoas.iterator();

    int somaIdade = 0;
    while (it.hasNext()) {
      Object o = it.next();
      Pessoa p = (Pessoa)o;

      somaIdade += p.getIdade();
    }
    System.out.println(somaIdade); // Imprime "3", pois p1 e p3 são as mesmas pessoas

  }
}
