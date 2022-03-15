import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q21 {
  public static void main(String[] args) {
    Cachorro c2 = new Cachorro("Dog", 2, 30);
    Cachorro c3 = new Cachorro("Dogão", 3, 33);
    Cachorro c1 = new Cachorro("Doguinho", 1, 15);

    List<Cachorro> listaCachorros = new ArrayList<Cachorro>();

    listaCachorros.add(c1);
    listaCachorros.add(c2);
    listaCachorros.add(c3);

    Collections.sort(listaCachorros);
    
    for (int i=0; i<listaCachorros.size(); i++) {
      System.out.println(listaCachorros.get(i));
    }
  }
}
