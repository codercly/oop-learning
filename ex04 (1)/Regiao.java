import java.util.ArrayList;
import java.util.List;

public class Regiao{
  private String nome; 
  private String tipo;
  private int populacaoOriginal; 
  private int populacaoSaudavel; 
  private int populacaoZumbi; 
  private int obitos;
  private List<Regiao> subregioes;

  //construtor
  public Regiao(String nome, String tipo, int populacaoOriginal){
    this.nome = nome;
    this.tipo = tipo;
    this.populacaoOriginal = populacaoOriginal;
    this.subregioes = new ArrayList<>();
  }


  //getters e setters
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public int getPopulacaoOriginal() {
    return populacaoOriginal;
  }

  public void setPopulacaoOriginal(int populacaoOriginal) {
    this.populacaoOriginal = populacaoOriginal;
  }

  public int getPopulacaoSaudavel() {
    return populacaoSaudavel;
  }

  public void setPopulacaoSaudavel(int populacaoSaudavel) {
    this.populacaoSaudavel = populacaoSaudavel;
  }

  public int getPopulacaoZumbi() {
    return populacaoZumbi;
  }

  public void setPopulacaoZumbi(int populacaoZumbi) {
    this.populacaoZumbi = populacaoZumbi;
  }

  public int getObitos() {
    return obitos;
  }

  public void setObitos(int obitos) {
    this.obitos = obitos;
  }

  public List<Regiao> getSubregioes() {
    return subregioes;
  }

  public void setSubregioes(List<Regiao> subregioes) {
    this.subregioes = subregioes;
  }

  //metodos

  public void cadastrarSubregiao(){
    //todo
  }

  public void emitirRelatório(){
    //todo
  }

  public boolean temSubregioes(){
    return !this.subregioes.isEmpty();
  }

  public void cadastrarSubregiao(Regiao subregiao){
    if(!subregiao.temSubregioes()){
      this.subregioes.add(subregiao);
    }
  }
}


  
