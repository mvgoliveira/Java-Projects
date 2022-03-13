import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTeste {
  public static void main(String[] args) {
    Map<String, Pessoa> mapa = new HashMap<String, Pessoa>();

    Pessoa p1 = new Pessoa("Arnaldo", "123", 40);
    Pessoa p2 = new Pessoa("Suzana", "456", 30);
    Pessoa p3 = new Pessoa("Eduarda", "789", 15);

    mapa.put(p1.getCpf(), p1);
    mapa.put(p2.getCpf(), p2);
    mapa.put(p2.getCpf(), p3); // Substitui o valor que tinha como chave o CPF da pessoa 2.

    System.out.println(mapa);

    getIdadeByCPF(mapa, "123");
    getIdadeByCPF(mapa, "124"); // Não existe

    //Existem duas maneiras de percorrer um Mapa
    getMapValues(mapa);
    getMapKeys(mapa);
  }

  public static void getIdadeByCPF (Map m, String cpf) {
    Pessoa p = (Pessoa) m.get(cpf);

    if (p != null) {
      System.out.println(p.getIdade());
    } else {
      System.out.println("CPF não encontrado!");
    }
  }

  // Percorrendo mapas
  public static void getMapValues(Map m) {
    System.out.println(m.values()); //Get all values

    Collection c = m.values();
    Iterator it = c.iterator();

    while (it.hasNext()) {
      Pessoa p = (Pessoa) it.next();
      System.out.println(p);
    }
  }

  public static void getMapKeys(Map m) {
    System.out.println(m.keySet()); //Get all keys

    Collection c = m.keySet();
    Iterator it = c.iterator();

    while (it.hasNext()) {
      String chave = (String) it.next();
      System.out.println(chave);
    }
  }
}
