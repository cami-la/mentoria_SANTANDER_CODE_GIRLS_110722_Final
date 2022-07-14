//classe filha da classe Funcionario. Indicamos essa hierarquia com a palavra reservada extends
public class Consultor extends Funcionario {
  //atributos próprios da classe consultor
  private double valorHora;
  private double horasTrabalhadas;

  //A classe filha é obrigada a criar um constructor que vem da classe mãe
  public Consultor(String nome, String cpf, double valorHora, double horasTrabalhadas) {
    //palavra reservada super: para indicar que esses atributos vêm da classe mãe
    super(nome, cpf);
    //palavra reservada this: para indicar que esses atributos são da própria classe
    this.valorHora = valorHora;
    this.horasTrabalhadas = horasTrabalhadas;
  }

  //métodos

  @Override //@Override significa que esse método veio da classe mãe e precisa ser implementado
  public double calculaSalario() {
    //regra para calcular o salário de um vendedor
    //palavra reservada return: indica que esse método retorna um valor quando é executado
    return valorHora * horasTrabalhadas;
  }

  //getter: usado para retornar o valor do atributo (note que ele retorna um valor)
  //setter: usado para modificar o valor do atributo (note que ele não retorna um valor, só atribui)

  public double getValorHora() {
    return valorHora;
  }

  public void setValorHora(double valorHora) {
    this.valorHora = valorHora;
  }

  public double getHorasTrabalhadas() {
    return horasTrabalhadas;
  }

  public void setHorasTrabalhadas(double horasTrabalhadas) {
    this.horasTrabalhadas = horasTrabalhadas;
  }
}
