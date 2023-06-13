class Main {

  public static void main(String[] args) {

    Triangulo t = new Triangulo();
    
    t.setLado1(3);
    t.setLado2(4);
    t.setLado3(5);
    System.out.println("Lado 1: " + t.getLado1());
    System.out.println("Lado 2: " + t.getLado2());
    System.out.println("Lado 3: " + t.getLado3());
    System.out.println("Tipo: " + t.definirTipo());
    System.out.println("Área pelo método tradicional: " + t.calcularArea());
    System.out.println("Área pelo método de Heron: " + t.heron());
  
    Retangulo r = new Retangulo();
    r.setAltura(5);
    r.setBase(5);
    System.out.println("area retângulo: " + r.calcularArea());

    Circulo c = new Circulo();
    c.setRaio(5.3);
    System.out.println("area circulo:" + c.calcularArea());
    
  }

}