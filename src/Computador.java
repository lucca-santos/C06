public class Computador {
    String marca;
    float preco;
    SistemaOperacional sisop;
    HardwareBasico[] hardwares = new HardwareBasico[3];
    MemoriaUSB usb;
    public void mostraComputador() {
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Sistema Operacional: " + sisop.nome + " - " + sisop.tipo + " Bits");
        System.out.println("Hardware: ");
        for (int i = 0; i < hardwares.length; i++) {
            if(i == 0) {
                System.out.println(hardwares[i].nome + " - " + hardwares[i].capacidade + " Mhz");
            }
            else {
                System.out.println(hardwares[i].nome + " - " + hardwares[i].capacidade + " Gb");
            }
        }
        if (usb != null) {
            System.out.println("Acompanha " + usb.nome + " " + usb.capacidade + " Gb");
        }
    }
}