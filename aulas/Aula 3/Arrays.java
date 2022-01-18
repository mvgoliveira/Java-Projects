public class Arrays {
  public static void main(String[] args) {
    char c[], a; // Apenas c é um array
    String [] s = new String[3], x = {"String1", "String2", "String3"}; // Todos são array
    
    int[] i = new int[3]; //Array de 3 posições (valor default = 0);

    i[0] = 15;
    s[0] = new String("String");

    System.out.println(x[0]); // String1
    
    for (int j = 0; j < x.length; j++) {
      System.out.println(x[j]); // String1, String2, String3 
    }
    
    for (String j:x) {
      System.out.println(j); // String1, String2, String3 
    }

    int myArray[] = new int[6]; // Esse primeiro array é sobrescrito
    myArray = new  int[10]; // Esse array reescreve o array e cima
    
  }
}
