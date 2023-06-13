public class Estudante{
  private String nome;
  private int matricula;
  private float nota1;
  private float nota2;
  private float nota3;
  private float m;

  public Estudante(String nome, int matricula, float nota1, float nota2, float nota3){
    this.setNome(nome);
    this.setMatricula(matricula);
    this.setNota1(nota1);
    this.setNota2(nota2);
    this.setNota3(nota3);

  }

  public float calcularMedia(){
    m = (this.nota1 + this.nota2 + this.nota3) / 3;
    return m;
  }

  public void aprovadoReprovado(){
    if(m >= 7){
      System.out.println("Aprovado(a)");
    } else {
      System.out.println("Reprovado(a)");
    }
  }
  
  public float getNota3() {
  	return nota3;
  }
  
  public void setNota3(float nota3) {
  	this.nota3 = nota3;
  }
  
  public float getNota2() {
  	return nota2;
  }
  
  public void setNota2(float nota2) {
  	this.nota2 = nota2;
  }
  
  public float getNota1() {
  	return nota1;
  }
  
  public void setNota1(float nota1) {
  	this.nota1 = nota1;
  }
  
  public String getNome() {
    	return nome;
    }
  public void setNome(String nome) {
  	this.nome = nome;
  }
  public int getMatricula() {
  	return matricula;
  }
  public void setMatricula(int matricula) {
  	this.matricula = matricula;
  }


}