public class Guitarra extends InstrumentoMusical implements TocarInstrumento{
  
  public Guitarra(String nome, String marca, String modelo, double preco){
    super(nome, marca, modelo, preco);
   
  }
  
  public void tocar(int tempo){
    System.out.println("Tocando uma guitarra por " + tempo + " horas");
  }
}