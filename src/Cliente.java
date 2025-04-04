public class Cliente {
    String nome;
    long CPF;
    int qtdComputadores = 0;
    Computador[] pcsComprados = new Computador[7]; //Supondo que o cliente só pode comprar 7 PCs
    double totalCompra = 0;

    public Cliente(String nome, long CPF) {
        this.nome = nome;
        this.CPF = CPF;
    }

    public void comprarComputador(Computador pc) {
        if (qtdComputadores < pcsComprados.length) {
            pcsComprados[qtdComputadores] = pc;
            qtdComputadores++;
            totalCompra += pc.preco;
        }
        else {
            System.out.println("Você atingiu o limite de PCs comprados! :(");
        }
    }

    public void calculaTotalCompra() {
        System.out.println("Cliente: " + nome);
        System.out.println("CPF: " + CPF);
        System.out.println();
        System.out.println("______________________");
        System.out.println();
        System.out.println("Computadores comprados: ");
        System.out.println();
        for (int i = 0; i < qtdComputadores; i++) {
            pcsComprados[i].mostraComputador();
            System.out.println();
            System.out.println();
        }
        System.out.println("Total da compra: R$ " + totalCompra);

    }
}