public class Emprestimo{

  private Livro livro;
  private User user;

  public Emprestimo(Livro livro, User user){
    this.livro = livro;
    this.user = user;
  }

  public boolean realizarEmprestimo(){
    if(livro.isDisponibilidade()){
      livro.setDisponibilidade(false);
      return true;
    } else {
      return false;
    }
  }

  public void realizarDevo(){
    livro.setDisponibilidade(true);
  }
  
  
}