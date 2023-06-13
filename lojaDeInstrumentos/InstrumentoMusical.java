public abstract class InstrumentoMusical{
  private String nome, marca, modelo;
  private double preco;

  public InstrumentoMusical(String nome, String marca, String modelo, double preco){
    this.setNome(nome);
    this.setMarca(marca);
    this.setModelo(modelo);
    this.setPreco(preco);
  }
  
  public abstract void tocar(int tempo);
  
  public String getMarca() {
	 return marca;
  }
  public void setMarca(String marca) {
	 this.marca = marca;
  }
  public String getModelo() {
	 return modelo;
  }
  public void setModelo(String modelo) {
	 this.modelo = modelo;
  }
  public double getPreco() {
	 return preco;
  }
  public void setPreco(double preco) {
	 this.preco = preco;
  }

  public String getNome() {
	 return nome;
  }
  public void setNome(String nome) {
	 this.nome = nome;
  }



}