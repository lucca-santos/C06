import java.util.Scanner;

public class Main_PCMANIA {
    public static void main(String[] args) {

        int matricula = 9857; //Minha matrícula do curso GET

        Cliente cliente = new Cliente("Lucca Alves e Santos", 123456789);

        Computador pro1 = new Computador();
        pro1.marca = "Apple";
        pro1.preco = matricula;
        pro1.sisop = new SistemaOperacional("Linux Ubuntu", 32);
        pro1.hardwares[0] = new HardwareBasico("Pentium Core i3", 2200);
        pro1.hardwares[1] = new HardwareBasico("Memória RAM", 8);
        pro1.hardwares[2] = new HardwareBasico("HD", 500);
        pro1.usb = new MemoriaUSB("Pen-drive de", 16);

        Computador pro2 = new Computador();
        pro2.marca = "Samsung";
        pro2.preco = matricula + 1234;
        pro2.sisop = new SistemaOperacional("Windows 8", 64);
        pro2.hardwares[0] = new HardwareBasico("Pentium Core i5", 3370);
        pro2.hardwares[1] = new HardwareBasico("Memória RAM", 16);
        pro2.hardwares[2] = new HardwareBasico("HD", 1000);
        pro2.usb = new MemoriaUSB("Pen-drive de", 32);

        Computador pro3 = new Computador();
        pro3.marca = "Dell";
        pro3.preco = matricula + 5678;
        pro3.sisop = new SistemaOperacional("Windows 10", 64);
        pro3.hardwares[0] = new HardwareBasico("Pentium Core i7", 4500);
        pro3.hardwares[1] = new HardwareBasico("Memória RAM", 32);
        pro3.hardwares[2] = new HardwareBasico("HD", 2000);
        pro3.usb = new MemoriaUSB("HD Externo de", 1000);

        int codigo;

        while(true) {
            System.out.println("Digite o código da promoção desejada (1 - Apple | 2 - Samsung | 3 - Dell). Deseja finalizar? Digite 0!");
            Scanner scanner = new Scanner(System.in);
            codigo = scanner.nextInt();

            switch (codigo) {
                case 1:
                    cliente.comprarComputador(pro1);
                    break;
                case 2:
                    cliente.comprarComputador(pro2);
                    break;
                case 3:
                    cliente.comprarComputador(pro3);
                    break;
                case 0:
                    System.out.println("Finalizando compra...");
                    System.out.println();
                    cliente.calculaTotalCompra();
                    scanner.close();
                    return;
                default:
                    System.out.println("Código/Opção inválida!");
            }

        }
    }
}
