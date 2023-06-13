public class Analista extends Funcionario{
  public Analista(String nome, double salario){
    super(nome, salario);
  }

  public double calcularSalario(){
    return getSalario() * 1.1;
  }

  
} 