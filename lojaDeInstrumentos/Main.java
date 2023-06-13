import java.util.ArrayList;
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    Bateria b = new Bateria("pearl", "pearlJam", "123", 500.00);
    Guitarra g = new Guitarra("chimbinha", "fender", "fenderStrato", 5000);
    Guitarra guitarra = new Guitarra("pirate", "pirate", "superstrato", 8000);

    System.out.println(b.getNome());
   // System.out.println(getMarca()); 
    
    System.out.println(b.getMarca());

    
    /*b.tocar(10);
    guitarra.tocar(3);
    g.tocar(2);*/
    
   /* System.out.println(g.getNome());
    System.out.println(g.getMarca());
    System.out.println(g.getModelo());
    System.out.println(g.getPreco());*/

    ArrayList<InstrumentoMusical>listaDeInstrumento = new ArrayList<InstrumentoMusical>();
    listaDeInstrumento.add(b);
    listaDeInstrumento.add(g);
    listaDeInstrumento.add(guitarra);

    for(int i = 0; i < listaDeInstrumento.size(); i++){
      InstrumentoMusical instrumentos = listaDeInstrumento.get(i);
      System.out.println(instrumentos.getNome()); 
      instrumentos.tocar(10);
    }


    
  }
}