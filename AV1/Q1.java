public class Q1 {
  public static void main(String[] args) {  
    Gato [] gatos = new Gato[2];

    gatos[0] = new Gato();
    gatos[1] = new Gato();

    testar(gatos);
  }

  public static void testar (Gato [] g) {
    for (int i = 0; i < g.length; i++) {
      g[i].emitirSom();
    }
  }
}
