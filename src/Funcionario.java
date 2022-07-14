//classe abstrata que só serve para herança. Não conseguimos criar um objeto desta classe.
public abstract class Funcionario {
  //atributos (características do objeto)
  private String nome;
  private String cpf;
  //constante criada para gravar o valor do salário mínimo
  protected final Double SALARIO_MINIMO = 1000.0;

  //construtor (informações necessárias para a criação do objeto desta classe)
  //para criar o construtor automaticamente (pressione alt+insert) e escolha a opção Constructor
  //não esquecer de selecionar todos os atributos (precione ctrl+selecione os atributos)
  public Funcionario(String nome, String cpf) {
    this.nome = nome;
    this.cpf = cpf;
  }

  //método abstrato (método que precisa obrigatoriamente ser implementado pelas classes filhas)
  public abstract double calculaSalario();
}
