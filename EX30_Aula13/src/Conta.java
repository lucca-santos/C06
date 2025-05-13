import java.util.HashSet;

public class Conta {
    private double saldo;
    private double limite;
    private HashSet<Cliente> clientes = new HashSet<>();

    public Conta(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void mostrarInfo() {
        System.out.println("=== Informações da Conta ===");
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("Limite: R$ " + limite);

        System.out.println("\n=== Informações dos Clientes ===");


        for (Cliente cliente : clientes) {
            try {
                System.out.println(" - " + cliente.getInfo());
            } catch (NullPointerException e) {
                System.out.println(" - Cliente nulo");
            }
        }
    }
}