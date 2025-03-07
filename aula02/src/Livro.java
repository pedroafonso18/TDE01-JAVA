public class Livro {
    public String titulo;
    public String autor;
    public int numeroPaginas;
    public boolean disponibilidade;

    public String exibirDetalhes(){
        return "Título:" + titulo + " Autor:" + autor + " Número de Páginas:" + numeroPaginas + " Disponibilidade:" + disponibilidade;
    }

    public void reservar() {
        if (disponibilidade) {
            disponibilidade = false;
        }
    }

    public void devolver() {
        disponibilidade = true;
    }

    public boolean isDisponivel() {
        return disponibilidade;
    }
}
