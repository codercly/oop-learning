public class User{
    
  
  private String cpf, nome;
  
  public User(String cpf, String nome){
    this.cpf = cpf;
    this.nome = nome;
  }

  public String getCpf(){
    return cpf;
  }

  public void setCpf(String cpf){
    this.cpf = cpf;
  }

  public String getNome(){
    return nome;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

}