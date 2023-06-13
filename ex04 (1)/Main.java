class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    Regiao brasil = new Regiao("Brasil", "país", 2000);
    Regiao sp = new Regiao("São Paulo", "Estado", 45_919_049);
    Regiao rj = new Regiao("Rio de Janeiro", "Estado", 17_366_189);
    Regiao spCapital = new Regiao("São Paulo", "Cidade", 12_106_920);
    Regiao rjCapital = new Regiao("Rio de Janeiro", "Cidade", 6_718_903);


    brasil.cadastrarSubregiao(sp);
    brasil.cadastrarSubregiao(rj);
    sp.cadastrarSubregiao(spCapital);
    rj.cadastrarSubregiao(rjCapital);


  }
}