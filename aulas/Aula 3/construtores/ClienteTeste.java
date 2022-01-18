package construtores;

public class ClienteTeste {
  public static void main(String[] args) {
    Cliente x = new Cliente("172.811.627-90");

    System.out.println(x.getCPF());
  }
}
