public class Livro extends Produto {
    private String autor;

    public Livro(String nome, double preco, String autor) {
        super(nome, preco);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Livro: " + getNome() + ", Autor: " + autor + ", Preço: R$" + getPreco());
    }
}