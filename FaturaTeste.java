package fatura;
public class FaturaTeste {
    
    public static void main(String[] args) {
        Fatura fatura1 = new Fatura("111111111", "Teclado USB", 2, 25.0);
        Fatura fatura2 = new Fatura("54234234", "Mouse sem fio", -3, -10.0);

        System.out.println("Fatura 1:");
        System.out.println("Número: " + fatura1.getNumero());
        System.out.println("Descrição: " + fatura1.getDescricao());
        System.out.println("Quantidade: " + fatura1.getQuantidade());
        System.out.println("Preço: " + fatura1.getPreco());
        System.out.println("Total da fatura: " + fatura1.getTotalFatura());

        System.out.println();

        System.out.println("Fatura 2:");
        System.out.println("Número: " + fatura2.getNumero());
        System.out.println("Descrição: " + fatura2.getDescricao());
        System.out.println("Quantidade: " + fatura2.getQuantidade());
        System.out.println("Preço: " + fatura2.getPreco());
        System.out.println("Total da fatura: " + fatura2.getTotalFatura());
    }
}
