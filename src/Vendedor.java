//classe filha da classe Funcionario. Indicamos essa hierarquia com a palavra reservada extends
public class Vendedor extends Funcionario {
  //atributos próprios da classe vendedor
  private double comissao;
  private int numeroDeVendas;

  //a classe filha é obrigada a criar um constructor que vem da classe mãe
  //para criar o construtor automaticamente (pressione alt+insert) e escolha a opção Constructor
  //não esquecer de selecionar todos os atributos (precione ctrl+selecione os atributos)
  public Vendedor(String nome, String cpf, double comissao, int numeroDeVendas) {
    //palavra reservada super: indica que esses atributos vêm da classe mãe
    super(nome, cpf);
    //palavra reservada this: indica que esses atributos são da própria classe
    this.comissao = comissao;
    this.numeroDeVendas = numeroDeVendas;
  }

  //métodos

  @Override //@Override significa que esse método veio da classe mãe e precisa ser implementado
  public double calculaSalario() {
    //regra para calcular o salário de um vendedor
    //palavra reservada return: indica que esse método retorna um valor quando é executado
    return super.SALARIO_MINIMO + (numeroDeVendas * comissao);
  }

  //getter: usado para retornar o valor do atributo (note que ele retorna um valor)
  //setter: usado para modificar o valor do atributo (note que ele não retorna um valor, só atribui)
  public double getComissao() {
    return comissao;
  }

  public void setComissao(double comissao) {
    this.comissao = comissao;
  }

  public int getNumeroDeVendas() {
    return numeroDeVendas;
  }

  public void setNumeroDeVendas(int numeroDeVendas) {
    this.numeroDeVendas = numeroDeVendas;
  }
}

