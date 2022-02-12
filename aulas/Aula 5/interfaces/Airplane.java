// Uma classe concreta é obrigada a implementar todos os métodos da interface

// Uma classe abstrata não é obrigada a implementar todos os métodos de uma inteface.

public class Airplane extends Vehicle implements Flyer, Metal {
  public void takeOff() {
    System.out.println("TakeOFF");
  }
  
  public void land() {
    System.out.println("Land");
  }
  
  public void fly() {
    System.out.println("Fly");
  }

  public void material() {
    System.out.println("is metal");
  }
}
