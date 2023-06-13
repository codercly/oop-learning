class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    Estudante estudante = new Estudante("rafael", 11316036, 8.2f, 5.5f, 1.0f);

    System.out.println(estudante.calcularMedia());
    estudante.aprovadoReprovado();
  }
}