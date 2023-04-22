public class Pessoa {
    private int idade;
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;
    private String nome;

    public Pessoa(String nome, int diaNascimento, int mesNascimento, int anoNascimento) {
        this.nome = nome;
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
    }

    public void calculaIdade(int diaAtual, int mesAtual, int anoAtual) {
        int idade = anoAtual - this.anoNascimento;
        if (mesAtual < this.mesNascimento || (mesAtual == this.mesNascimento && diaAtual < this.diaNascimento)) {
            idade--;
        }
        this.idade = idade;
    }

    public int informaIdade() {
        return this.idade;
    }

    public String toString() {
        return "Nome: " + this.nome + "\nData de nascimento: " + this.diaNascimento + "/" + this.mesNascimento + "/" + this.anoNascimento + "\nIdade: " + this.idade;
    }

    public void ajustaDataDeNascimento(int diaNascimento, int mesNascimento, int anoNascimento) {
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
    }
}
