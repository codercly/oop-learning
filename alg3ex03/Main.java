class Main {

  public static void main(String[] args) {

    Livro livro1 = new Livro("harry", "04442", "fansia");
    User user1 = new User("022044", "rafael");

    Livro livro2 = new Livro("O Pequeno Príncipe", "9788582180285", "Infantil");
    User user2 = new User("222.222.222-22", "Ciclano");

      
    System.out.println(livro1.getTitulo());  
    System.out.println(livro1.getIsbn());  

    System.out.println(user1.getNome());
    System.out.println(user1.getCpf());

      Emprestimo emprestimo1 = new Emprestimo(livro1, user1);
      Emprestimo emprestimo2 = new Emprestimo(livro2, user2);

        boolean resultadoEmprestimo1 = emprestimo1.realizarEmprestimo();
        System.out.println("Emprestimo 1 realizado: " + resultadoEmprestimo1); 

        boolean resultadoEmprestimo2 = emprestimo2.realizarEmprestimo();
        System.out.println("Emprestimo 2 realizado: " + resultadoEmprestimo2); 

        
        boolean resultadoEmprestimo3 = emprestimo1.realizarEmprestimo();
        System.out.println("Emprestimo 3 realizado: " + resultadoEmprestimo3); 

        emprestimo1.realizarDevo();

        boolean resultadoEmprestimo4 = emprestimo1.realizarEmprestimo();
        System.out.println("Emprestimo 4 realizado: " + resultadoEmprestimo4);
      
  }

}