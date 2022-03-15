public class JarTest {
  public static void main(String[] args) {
    // JAR (Java ARchive) é um pacote utilizado para agregar diversos arquivos 
    // de classe Java e arquivos associados (texto, imagem, etc).
    
    if (args.length == 2) {
      System.out.println( args[0] + "-" + args[1]);
    } else {
      System.out.println("Insira 2 (dois) parâmetros!");
    }

    // Para rodar o JarTest.jar, digite no console:
    // java -jar --enable-preview Aula8.jar 1 2
  }
}
