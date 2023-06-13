public class Triangulo {

  private double lado1, lado2, lado3;
  

  public double getLado1(){
    return lado1;
  }

  public void setLado1(double lado1){
    this.lado1 = lado1;
  }

  public double getLado2(){
    return lado2;
  }

  public void setLado2(double lado2){
    this.lado2 = lado2;
  }

  public double getLado3(){
    return lado3;
  }

  public void setLado3(double lado3){
    this.lado3 = lado3;
  }

  public String definirTipo(){
    if(this.lado1 == this.lado2 && this.lado1 == this.lado3){
      return "Equilátero";
    } else if(this.lado1 == this.lado2 || this.lado1 == this.lado3 || this.lado2 == this.lado3){
      return "Isósceles";
    } else{
      return "Escaleno";
    }
  }

  public double heron(){
    double p = (lado1 + lado2 + lado3) / 2;
    double area = Math.sqrt(p * (p - lado1) * (p - lado2) * (p - lado3)) / lado1;
    return area;
  }
  
  public double calcularArea(){
    double altura = calcularAltura();
    double area = lado1 * altura / 2;
    return area;
  }

  private double calcularAltura(){
    double p = (lado1 + lado2 + lado3) / 2;
    return 2 * Math.sqrt(p * (p - lado1) * (p - lado2) * (p - lado3)) / lado1;
  }

}