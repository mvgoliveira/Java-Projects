public class ArrayInverso {
  public static int[] inverteArray(int[] array) {

    int[] ArrayInverso = new int[array.length];
    int n = array.length - 1;
    for (int i : array) {
      ArrayInverso[n] = i;
      n--;  
    }

    return ArrayInverso;
  }
  public static void main(String[] args) {
    int[] array = new int[20];

    for (int i = 0; i < array.length; i++) {
      array[i] = i;
    }

    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    
    array = inverteArray(array);

    System.out.println("");
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
  }
}
