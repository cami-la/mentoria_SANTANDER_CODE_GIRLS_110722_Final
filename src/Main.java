
public class Main {
  //método usado como ponto de entrada para rodar um programa Java
  public static void main(String[] args) {
    //System.out.println("Hello world!");

    Vendedor vendedor1 = new Vendedor("camila", "123.456.789-00", 10.0, 5);
    System.out.println("Salario do Vendedor " + vendedor1.calculaSalario());

    Consultor consultor1 = new Consultor("consultor", "111.111.111-11", 100.50, 10);
    System.out.println("Salario do Consultor " + consultor1.calculaSalario());

    Macaco macaco1 = new Macaco();
    macaco1.comer("Maçã");
    macaco1.comer("Uva");
    macaco1.comer("banana");
    macaco1.comer("Morango");

    macaco1.digerir();
    macaco1.digerir();
    macaco1.digerir();

    System.out.println("------------");

    Macaco macaco2 = new Macaco();
    macaco2.comer("Maçã");
    macaco2.comer("Uva");
    macaco2.comer("banana");

    macaco2.digerir();
    macaco2.digerir();
    macaco2.digerir();
    macaco2.digerir();
  }
}