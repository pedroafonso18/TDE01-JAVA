public class Livraria {
    public Livro[] livros = new Livro[10];

    public void inserirLivro(Livro livro) {
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] == null) {
                livros[i] = livro;
                break;
            }
        }
        return;
    }

    public Livro[] listarLivros() {
        return livros;
    }

    public Livro[] listarDisponiveis() {
        Livro[] disponiveis = new Livro[10];
        int index = 0;
        for (Livro livro : livros) {
            if (livro != null && livro.disponibilidade) {
                disponiveis[index++] = livro;
            }
        }
        return disponiveis;
    }

    public void reservar(Livro livro) {
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] != null && livros[i].equals(livro)) {
                livros[i].reservar();
                break;
            }
        }
    }

    public void devolver(Livro livro) {
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] != null && livros[i].equals(livro)) {
                livros[i].devolver();
                break;
            }
        }
    }
}
