import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DataBase {
  public static void main(String[] args) {
    Map<String, Double> m = new HashMap<String, Double>();
    m.put("1234#1", 1000.70);
		m.put("553742#3", 10000.50);
		m.put("12#2", 1300.10);
		m.put("4343#1", 1000.80);
    double med = calculaMedia(m, 1); //essa chamada deve calcular a média dos salários dos funcionários com código do cargo = 1.
    System.out.println(med);
  }

  public static double calculaMedia (Map<String, Double> g, int cargo) {
    int n = 0;
    double soma = 0;

    for (String chave : g.keySet()) {
      String [] chaveArray = chave.split("#");
      String cargoSelecionado = chaveArray[1];

      if (cargoSelecionado.equals(Integer.toString(cargo))) {
        soma += (Double) g.get(chave);
        n += 1; 
      }
    }

    return soma / n;
  }
}
