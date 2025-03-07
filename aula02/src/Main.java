//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Livraria livraria = new Livraria();

        Livro livro1 = new Livro();
        livro1.titulo = "Livro 1";
        livro1.autor = "Autor 1";
        livro1.numeroPaginas = 100;
        livro1.disponibilidade = true;

        Livro livro2 = new Livro();
        livro2.titulo = "Livro 2";
        livro2.autor = "Autor 2";
        livro2.numeroPaginas = 200;
        livro2.disponibilidade = true;

        livraria.inserirLivro(livro1);
        livraria.inserirLivro(livro2);

        System.out.println("Lista de livros:");
        for (Livro livro : livraria.listarLivros()) {
            if (livro != null) {
                System.out.println(livro.exibirDetalhes());
            }
        }

        System.out.println("\nReservando Livro 1...");
        livraria.reservar(livro1);

        System.out.println("\nLista de livros disponíveis:");
        for (Livro livro : livraria.listarDisponiveis()) {
            if (livro != null) {
                System.out.println(livro.exibirDetalhes());
            }
        }

        System.out.println("\nDevolvendo Livro 1...");
        livraria.devolver(livro1);

        System.out.println("\nLista de livros disponíveis:");
        for (Livro livro : livraria.listarDisponiveis()) {
            if (livro != null) {
                System.out.println(livro.exibirDetalhes());
            }
        }
    }
}