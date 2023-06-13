public class Gerente extends Funcionario{
  public Gerente(String nome, double salario){
    super(nome, salario);
  }

  public double calcularSalario(){
    return getSalario() * 1.2;
  }


  
}