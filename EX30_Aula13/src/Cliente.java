public class Cliente {
    private String nome;
    private int idade;

    public Cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getInfo() {
        return "Nome: " + nome + ", Idade: " + idade;
    }
}