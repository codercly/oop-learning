public class Circulo {
  private double raio;

  public double getRaio(){
    return raio;
  }

  public void setRaio(double raio){
    this.raio = raio;
  }

  public double calcularArea(){
    double area;
    area = 3.14 * (raio * raio);
    return area;
  }
  
}