class Main {
  public static void main(String[] args) {
    
    
    Funcionario f1 = new Analista("rafael", 1000);
    Funcionario gerente1 = new Gerente("rodrigo", 2500);
    Funcionario funcionario1 = new Funcionario("rafaela", 5000);
    System.out.println(f1.calcularSalario());
    System.out.println(gerente1.calcularSalario());
    System.out.println(funcionario1.calcularSalario());
    
  }
}