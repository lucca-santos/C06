public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta(1500.0, 700.0);

        Cliente cliente1 = new Cliente("João Silva", 30);
        Cliente cliente2 = new Cliente("Maria Oliveira", 25);
        Cliente clienteNulo = null;

        conta.adicionarCliente(cliente1);
        conta.adicionarCliente(cliente2);
        conta.adicionarCliente(clienteNulo);  // cliente nulo propositalmente

        conta.mostrarInfo();

        System.out.println("Programa executado até o final.");
    }
}