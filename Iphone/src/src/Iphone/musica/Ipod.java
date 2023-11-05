package Iphone.musica;

public class Ipod implements ReprodutorMusical{
    public void tocarMusica(){
        System.out.println("tocando a musica");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando musica");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionado a musica");

    }

}
