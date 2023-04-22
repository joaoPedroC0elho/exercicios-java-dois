public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa einstein = new Pessoa("Albert Einstein", 14, 3, 1879);
        Pessoa newton = new Pessoa("Isaac Newton", 4, 1, 1643);
        
        einstein.calculaIdade(21, 4, 2023);
        newton.calculaIdade(21, 4, 2023);
        
        System.out.println("Idade de Einstein: " + einstein.informaIdade());
        System.out.println("Idade de Newton: " + newton.informaIdade());
    }
}
