public class Bateria extends InstrumentoMusical implements TocarInstrumento{

  public Bateria(String nome, String marca, String modelo, double preco){
    super(nome, marca, modelo, preco);
   
  }
  public void tocar(int tempo){
    System.out.println("tocando uma bateria por " + tempo + " horas" );
  }


  
}