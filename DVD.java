public class DVD extends Produto {
    private int duracao;

    public DVD(String nome, double preco, int duracao) {
        super(nome, preco);
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("DVD: " + getNome() + ", Duração: " + duracao + " minutos, Preço: R$" + getPreco());
    }
}