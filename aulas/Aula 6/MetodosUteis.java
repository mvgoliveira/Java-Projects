import java.util.ArrayList;

public class MetodosUteis {
  public static void main(String[] args) {
    String str = "A casa é bonita";
    char [] array_char = str.toCharArray();

    // Espaços também são caracteres
    for (int i = 0; i < array_char.length; i++) {
      System.out.print(" " + array_char[i]);
    }
    
    // Quantidade de caracteres contando os espaços 
    System.out.println("\n" + array_char.length);
    
    // Remove os espaços
    String [] array_str = str.split(" ");
    
    for (int i = 0; i < array_str.length; i++) {
      System.out.print("" + array_str[i]);
    }

    // Quantidade de palavras
    System.out.println("\n" + array_str.length);

    // Retorna uma nova string em minúsculo
    System.out.println(str.toLowerCase());
    
    // Retorna uma nova string em caixa alta
    System.out.println(str.toUpperCase());
    
    // Retorna uma nova string removendo os espaços nas laterais.
    System.out.println(str.trim());

    String n1 = "14";
    String n2 = "14.1";

    // Retorna um inteiro
    int num1 = Integer.parseInt(n1);
    System.out.println(((Object)num1).getClass().getSimpleName());
    
    // Retorna um double
    double num2 = Double.parseDouble(n2);
    System.out.println(((Object)num2).getClass().getSimpleName());

    ArrayList<String> lista = new ArrayList<String>();
    lista.add("Antonio#15");
    lista.add("Luana#17");
    lista.add("Marcelo#15");

    int soma = 0;
    for (int i = 0; i < lista.size(); i++) {
      String linha = (String) lista.get(i);
      String [] nome_idade = linha.split("#");

      int idade = Integer.parseInt(nome_idade[1]);

      soma += idade;
    }
    System.out.println((double) soma/lista.size());
    
  }
}
