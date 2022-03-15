import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsTeste {
  public static void main(String[] args) {
    List<String> lista = new ArrayList<String>();

    lista.add("Manoel");
    lista.add("José");
    lista.add("Marcia");

    System.out.println(lista);
    
    Collections.sort(lista);

    System.out.println(lista);

    // E quando eu tento ordenar uma classe que eu mesmo fiz?
    // Quem define o mecanismo de ordenação?

    Conta c1 = new Conta("1", 150);
    Conta c2 = new Conta("3", 150);
    Conta c3 = new Conta("2", 150);

    List<Conta> listaConta = new ArrayList<Conta>();

    listaConta.add(c1);
    listaConta.add(c1);
    listaConta.add(c2);
    listaConta.add(c3);
    
    System.out.println(listaConta);
    
    Collections.sort(listaConta);

    System.out.println(listaConta);

    // Conta quantos objetos "o" existem em "c".
    System.out.println(Collections.frequency(listaConta, c1));

    // Embaralhar elementos de uma lista

    Collections.shuffle(listaConta);

    System.out.println(listaConta);

    // Copiar elementos de uma lista para outra
    List<Conta> novaLista = new ArrayList<Conta>(listaConta); // Precisam ser do memso tamanho
    
    Collections.copy(novaLista, listaConta); // Isso não funciona bem
    
    System.out.println(novaLista);

  }
}
