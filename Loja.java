public class Loja {
    public static void main(String[] args) {
        Livro livro = new Livro("O Senhor dos Anéis", 49.90, "J.R.R. Tolkien");
        CD cd = new CD("Thriller", 29.90, 9);
        DVD dvd = new DVD("Os Incríveis", 19.90, 115);
        Livro livro2 = new Livro("Dom Casmurro", 14.90, "Machado de Assis");
        DVD dvd2 = new DVD("Harry Potter e o Cálice de Fogo", 24.90, 157);

        livro.imprimirDetalhes();
        cd.imprimirDetalhes();
        dvd.imprimirDetalhes();
        livro2.imprimirDetalhes();
        dvd2.imprimirDetalhes();
    }
}