import java.util.ArrayList;
import java.util.List;

public class TesteArrayList {
  public static void main(String[] args) {
    List lista = getPessoas();
    List lista2 = getPessoas();

    System.out.println(lista);
    
    Pessoa3 pessoa_a_consultar = new Pessoa3("Marcus", 20);
    
    int indice = lista.indexOf(pessoa_a_consultar); 
    
    // indice 0 -> Só verifica se os nomes são iguais
    System.out.println("O índice do objeto é: " + indice);
    
    // True -> O nome verificado existe
    System.out.println(lista.contains(pessoa_a_consultar));
    
    //True -> Removeu o marcus
    System.out.println(lista.remove(pessoa_a_consultar));
    System.out.println(lista);
    
    //[Vinicius-20] -> Removeu o indice 0 e mostrou quem foi
    System.out.println(lista.remove(0));
    System.out.println(lista);
    
    //Remove todos os elementos de lista da lista 2
    System.out.println(lista2);
    //True -> Removeu
    System.out.println(lista2.removeAll(lista));
    System.out.println(lista2);
  }

  public static List<Pessoa3> getPessoas() {
    ArrayList<Pessoa3> lista = new ArrayList<Pessoa3>();
    List<String> banco = getPessoasDoBancoDeDados();

    for (int i = 0; i < banco.size(); i++) {
      String pessoatr = (String) banco.get(i);
      String [] array_pessoa = pessoatr.split("#");
      Pessoa3 p = new Pessoa3(array_pessoa[0], Integer.parseInt((array_pessoa[1])));
      lista.add(p);
    }

    return lista;
  }

  public static List<String> getPessoasDoBancoDeDados() {
    ArrayList<String> x = new ArrayList<String>();
    x.add("Marcus#21");
    x.add("Vinicius#20");
    x.add("Gomes#20");
    x.add("Oliveira#20");
    return x;
  }
}
