import java.util.ArrayList;
import java.util.List;

public class ArrayListTeste {
  public static void main(String[] args) {
    List lista = new ArrayList();

    lista.add("Marcus");
    lista.add("Vinicius");
    lista.add("Gomes");
    lista.add("Oliveira");

    System.out.println(lista.get(1)); // -> Vinicius
  }
}
