package polimorfismo;

public class GatoTeste {
  public static void main(String[] args) {
    Animal animal = new Gato(); // Olhando o objeto gato como um animal.
    animal.setNome("Zelda");

    // animal.miar(); -> Não funciona, apesar animal ser um objeto da classe gato.
    // Isso acontece por que estamos nos referenciando a ele como um Animal simples.

    if (animal instanceof Gato) {
      System.out.println(animal); // Sobrescrita de métodos de Object
      System.out.println("É um gato");
      animal.emitirSom();
      System.out.println("É a " + animal.getNome());
      
      Gato gato = (Gato) animal; //Casting de objeto - referenciando o animal como um gato.
      
      gato.ronronar();
      System.out.println("É a " + gato.getNome());
    } else {
      System.out.println("Não é um gato");
    }

  }
}
