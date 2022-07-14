import java.util.ArrayList;
import java.util.List;

public class Macaco {
  //atributos (características do objeto)
  private String nome;
  //List: estrutura de dados que armazena vários dados. Neste caso, várias Strings (comidas)
  private List<String> bucho = new ArrayList<>();

  //nesta classe não criamos um construtor personalizado.
  // Logo, "por baixo dos panos" existe um construtor padrão que não recebe atributos

  //metodos
  public void comer(String comida) { //método recebe a comida
    if (bucho.size() == 3) { //se a variável bucho estiver 3 alimentos
      System.out.println("Bucho Cheio!"); //imprima: bucho cheio
    } else { //se não
      bucho.add(comida); //adicione a comida no bucho do objeto macaco
    }
    System.out.println(bucho); //ao final, mostre os alimentos no bucho do macaco
  }

  public void digerir() { //método digere a comida
    if (bucho.isEmpty()) { //se a variável bucho estiver vazio
      System.out.println("Bucho Vazio!"); //imprima: bucho vazio
    } else { //se não
      bucho.remove(bucho.get(0)); //remova a primeira comida no bucho do objeto macaco
    }
    System.out.println(bucho); //ao final, mostre os alimentos no bucho do macaco
  }
}
