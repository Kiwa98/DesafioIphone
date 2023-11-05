package Iphone.ligação;

public class Ligacao implements Chamadas{
    @Override
    public void ligar() {
        System.out.println("iniciando ligação");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo Ligação");
    }

    @Override
    public void correioVoz() {
        System.out.println("Correio de voz");
    }
}
