public class Livro{
  private String  titulo, isbn, genero;
  private boolean disponibilidade;

  public Livro(String titulo, String isbn, String genero){
    this.titulo = titulo;
    this.isbn = isbn;
    this.genero = genero;
    this.disponibilidade = true;
  }

  public String getTitulo(){
    return titulo;
  }

  public void setTitulo(String titulo){
    this.titulo = titulo;
  }

    public String getIsbn(){
    return isbn;
  }

  public void setIsbn(String isbn){
    this.isbn = isbn;
  }

  public String getGenero(){
    return genero;
  }

  public void setGenero(String genero){
    this.genero = genero;
  }

  public boolean isDisponibilidade(){
    return disponibilidade;
  }

  public void setDisponibilidade(boolean disponibilidade){
    this.disponibilidade = disponibilidade;
  }

  
}